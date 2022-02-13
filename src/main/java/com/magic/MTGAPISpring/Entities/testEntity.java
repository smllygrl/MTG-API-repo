package com.magic.MTGAPISpring.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "test_entity")
public class testEntity {

    //This allows database to automatically generate id
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

//    @Getter @Setter
//    @NotBlank -- Not LOMBOK

    String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = this.name;
    }

//    @Getter @Setter
//    @NotNull -- NOT LOMBOK
    Integer power;
    public Integer getPower() {
        return this.power;
    }
    public void setPower(Integer power) {
        this.power = this.power;
    }

    public testEntity(String name, Integer power) {
        this.name = name;
        this.power = power;
    }

    public testEntity () {};
}
