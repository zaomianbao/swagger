package com.zaomianbao.swagger.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @Description 用户实体
 * @Author zaomianbao
 * @Date 2019/1/9
 **/
@Data
@Builder
public class User {

    private String username;
    private Integer age;
}
