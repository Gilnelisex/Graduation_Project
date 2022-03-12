package com.example.test.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @TableName rotation
 */
@Data
public class Rotation implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String image;

    /**
     * 
     */
    private String url;

    /**
     * 
     */
    private String information;

    /**
     * 
     */
    private Integer rotationstatus;

    private String rotationstatusz;

    /**
     * 
     */
    private Integer location;

    /**
     * 
     */
    private Date updatetime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ustartime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date uendtime;
    /**
     * 
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cstartime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cendtime;

    private Date createtime;

    private static final long serialVersionUID = 1L;
}