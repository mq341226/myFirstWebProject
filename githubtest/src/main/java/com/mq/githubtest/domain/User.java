package com.mq.githubtest.domain;

import lombok.Data;

/**
 * 用户实体类
 */
@Data
public class User {
    private Integer id;
    private String uname;
    private String password;
}
