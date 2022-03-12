package com.example.test.things.imgupload;

import org.springframework.web.multipart.MultipartFile;

public interface ImageUploadService {

    String uploadImages(MultipartFile file);

}
