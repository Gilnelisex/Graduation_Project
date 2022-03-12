package com.example.test.controller;

import com.example.test.domain.Managers;
import com.example.test.domain.WangEditor;
import com.example.test.service.ManagersService;
import com.example.test.things.imgupload.ImageUploadService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImgController {
    @Autowired
    ImageUploadService imageUploadService;
    @Autowired
    ManagersService managersService;

    @GetMapping("/getChangePic/{id}")
    public String getChangePic(@PathVariable("id") Integer id, Model model) {
        Managers managers = this.managersService.selectByPrimaryKey(id);
        model.addAttribute("manager", managers);
        return "management/changePic";
    }

    @PostMapping("/uploadImage")
    public String uploadImage(@RequestParam(value = "file", required = false) MultipartFile file, Integer id) {
        String url = imageUploadService.uploadImages(file);
        if (StringUtils.isBlank(url)) {
            return "redirect:/management";
        } else {
            Managers managers = new Managers();
            managers.setPicture(url);
            managers.setId(id);
            this.managersService.updateByPrimaryKeySelective(managers);
            return "redirect:/personalCenter";
        }
    }

    @PostMapping("/uploadPicture")
    @ResponseBody
    public String uploadPicture(@RequestParam(value = "file", required = false) MultipartFile file) {
        String url = imageUploadService.uploadImages(file);
        return url;
    }

    @PostMapping("/uploadImages")
    @ResponseBody
    public WangEditor uploadImage(MultipartFile file) {
        String url = imageUploadService.uploadImages(file);
        String[] strs = {url};
        WangEditor wangEditor = new WangEditor(strs);
        return wangEditor;
    }
}
