package com.example.test.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @TableName joininfo
 */
@Data
public class Joininfo implements Serializable {
    /**
     * 
     */
    private Integer id;
    /**
     * 
     */
    private Integer actid;

    private String aname;

    /**
     * 
     */
    private Integer userid;

    private String unickname;

    private String uaccount;
    /**
     * 
     */
    private Integer manageid;

    private String mnickname;

    private String maccount;

    /**
     * 
     */
    private Integer infostatus;

    private String infostatusz;

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
    private String username;

    /**
     * 
     */
    private String userphone;

    /**
     * 
     */
    private String useridno;

    /**
     * 
     */
    private Integer usernums;

    /**
     * 
     */
    private Integer userprices;

    /**
     * 
     */
    private Date appointment;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date astartime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date aendtime;

    private static final long serialVersionUID = 1L;
}