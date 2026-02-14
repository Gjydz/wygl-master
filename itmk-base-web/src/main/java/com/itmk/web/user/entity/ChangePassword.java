package com.itmk.web.user.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname ChangePassword
 * @Description
 */
@Data
public class ChangePassword implements Serializable {
    private Long userId;
    //姓名
    private String oldPassword;
    //登录密码
    private String newPassword;
}
