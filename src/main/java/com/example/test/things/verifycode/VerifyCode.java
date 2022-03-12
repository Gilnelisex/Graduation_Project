package com.example.test.things.verifycode;

import lombok.Data;

/**
 * 验证码类
 */
@Data
public class VerifyCode {
    private String code;
    private byte[] imgBytes;
    private long expireTime;
}