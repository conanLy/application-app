package com.example.applicationapp.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class User {

    private String name;
    @NotNull(message = "密钥不能为空")
    @NotBlank(message = "密钥不能为空")

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
