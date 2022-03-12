package com.example.test.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @TableName managers
 */
@Data
public class Managers implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String picture;

    /**
     * 
     */
    private String account;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String nickname;

    /**
     * 
     */
    private String sex;

    /**
     * 
     */
    private String phonenum;

    /**
     * 
     */
    private Integer managerstatus;

    private String managerstatusz;

    /**
     * 
     */
    private Integer level;

    private String levelz;

    /**
     * 
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endtime;

    private Date registertime;

    private static final long serialVersionUID = 1L;
}