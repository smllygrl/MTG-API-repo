package com.magic.MTGAPISpring.Payloads.Requests;

public class textBoxCreatePayload {

    private String abilities;
    private String flavourText;

    //Getter & Setter for Card Abilities
    public String getAbilities () {
        return this.abilities;
    }

    public void setAbilities () {
        this.abilities = abilities;
    }

    //Getter & Setter for flavourText of Card
    public String getFlavourText () {
        return this.flavourText;
    }

    public void setFlavourText () {
        this.abilities = flavourText;
    }
}
