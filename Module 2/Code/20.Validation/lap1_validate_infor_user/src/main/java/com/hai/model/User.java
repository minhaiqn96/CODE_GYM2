package com.hai.model;

import javax.validation.constraints.*;

public class User {

    @NotEmpty
    @Size(min = 2, max = 30)
    private String name;

//    @NotNull
    @Min(value = 18, message = " age is not lower 18")
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}