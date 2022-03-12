package com.example.test.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @TableName review
 */
@Data
public class Review implements Serializable {
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
    private String title;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private Integer reviewstatus;

    private String reviewstatusz;

    /**
     * 
     */
    private Integer visitnum;

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
    private Integer relationact;

    private String relationactz;

    private static final long serialVersionUID = 1L;
}