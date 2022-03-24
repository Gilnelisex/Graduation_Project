package com.example.test.domain;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class StatisticalResults {

    private String basename;

    @DateTimeFormat(pattern = "yyyy-MM")
    private Date querytime;

    private String years;

    private String months;

    private Integer pricecount;

}
