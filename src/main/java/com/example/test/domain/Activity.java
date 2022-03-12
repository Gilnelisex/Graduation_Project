package com.example.test.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @TableName activity
 */
@Data
public class Activity implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String picture;

    /**
     * 
     */
    private Integer field;

    private String fieldz;

    /**
     * 
     */
    private String reason;

    /**
     * 
     */
    private String bright;

    /**
     * 
     */
    private String introduce;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String harvest;

    /**
     * 
     */
    private Integer time;

    /**
     * 
     */
    private Integer num;

    /**
     * 
     */
    private Integer price;

    /**
     * 
     */
    private Integer actstatus;

    private  String actstatusz;

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

    private static final long serialVersionUID = 1L;
}