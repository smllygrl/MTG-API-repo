package com.magic.MTGAPISpring.Payloads.Requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class testCreatePayload {

    @NotBlank
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    @NotNull
    private Integer power;

    public Integer getPower() {
        return this.power;
    }

    public void setPower() {
        this.power = power;
    }

    //Constructor
    public testCreatePayload () {}

    //Overloading constructor
    public testCreatePayload (String name, Integer power) {
        this.name = name;
        this.power = power;
    }
}
