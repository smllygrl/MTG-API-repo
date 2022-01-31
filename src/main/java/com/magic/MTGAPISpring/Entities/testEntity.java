package com.magic.MTGAPISpring.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class testEntity {

    //This allows database to automatically generate id
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

//    @Getter @Setter
//    @NotBlank -- Not LOMBOK
    String name;

//    @Getter @Setter
//    @NotNull -- NOT LOMBOK
    Integer power;

    public testEntity(String name, Integer power) {
        this.name = name;
        this.power = power;
    }

    public testEntity () {};
}
