package com.example.test.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @TableName users
 */
@Data
public class Users implements Serializable {
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
    private Integer userstatus;

    private String userstatusz;

    /**
     * 
     */
    private Integer level;

    /**
     * 
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endtime;

    private Date registertime;

    private Date registertimez;

    private static final long serialVersionUID = 1L;
}