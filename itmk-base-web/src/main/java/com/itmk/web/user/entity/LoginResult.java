package com.itmk.web.user.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname LoginResult
 * @Description 用户登录成功之后返回的数据
 */
@Data
public class LoginResult implements Serializable {
    private Long userId;
    private String token;
    //token过期时间
    private Long expireTime;
}
