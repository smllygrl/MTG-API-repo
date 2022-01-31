package com.magic.MTGAPISpring.Entities;

public class TextBox {

    public String abilities;
    public String flavourText;

    public TextBox (String abilities, String flavourText) {
        this.abilities = abilities;
        this.flavourText = flavourText;
    }

    public String getAbilities() {
        return abilities;
    }
}
