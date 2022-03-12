package com.example.test.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @TableName base
 */
@Data
public class Base implements Serializable {
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
    private String name;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private Integer hour;

    /**
     * 
     */
    private Integer basestatus;

    private String basestatusz;

    /**
     * 
     */

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cstartime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cendtime;

    private Date createtime;

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
    private String province;

    /**
     * 
     */
    private String city;

    private static final long serialVersionUID = 1L;
}