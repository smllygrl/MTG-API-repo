package com.magic.MTGAPISpring.Payloads.Requests;

import com.magic.MTGAPISpring.Entities.TextBox;

public class mtgCardCreatePayload {

    private String name;
    private String manaCost;
    private String typeLine;
    private String expansionSymbol;
    private TextBox textBox;
    private String artistInfo;
    private Integer collectorNum;
    private Integer powerTough;
    private String setSymbolAndRarity;

    //Getter & Setter for Card Name
    public String getName () {
        return this.name;
    }

    public void setName () {
        this.name = name;
    }

    //Getter & Setter for manaCost of Card
    public String getManaCost () {
        return this.manaCost;
    }

    public void setManaCost () {
        this.manaCost = manaCost;
    }

    //Getter & Setter for typeLine of Card
    public String getTypeLine () {
        return this.typeLine;
    }

    public void setTypeLine () {
        this.typeLine = typeLine;
    }

    //Getter & Setter for expansionSymbol of Card
    public String getExpansionSymbol () {
        return this.expansionSymbol;
    }

    public void setExpansionSymbol () {
        this.expansionSymbol = expansionSymbol;
    }

    //Getter & Setter for textBox of Card
    public TextBox getTextBox () {
        return this.textBox;
    }

    public void setTextBox () {
        this.textBox = textBox;
    }

    //Getter & Setter for artistInfo of Card
    public String getArtistInfo () {
        return this.artistInfo;
    }

    public void setArtistInfo () {
        this.artistInfo = artistInfo;
    }

    //Getter & Setter for collectorNum of Card
    public Integer getCollectorNum () {
        return this.collectorNum;
    }

    public void setCollectorNum () {
        this.collectorNum = collectorNum;
    }

    //Getter & Setter for powerTough of Card
    public Integer getPowerTough () {
        return this.powerTough;
    }

    public void setPowerTough () {
        this.powerTough = powerTough;
    }

    //Getter & Setter for SetSymbol&Rarity of Card
    public String getSetSymbolAndRarity () {
        return this.setSymbolAndRarity;
    }

    public void setSetSymbolAndRarity () {
        this.setSymbolAndRarity = setSymbolAndRarity;
    }
}
