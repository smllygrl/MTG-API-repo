package com.magic.MTGAPISpring.Entities;

public class magicCard {

    String name;
    String manaCost;
    String typeLine;
    String expansionSymbol;
    TextBox textBox;
    String artistInfo;
    Integer collectorNum;
    Integer powerTough;

    //Use enum for card borders because there are only 5 of them
    String cardBorder;

    public magicCard(String name, String manaCost, String typeLine, String expansionSymbol, TextBox textBox, String artistInfo, Integer collectorNum, Integer powerTough) {
        this.name = name;
        this.manaCost = manaCost;
        this.typeLine = typeLine;
        this.expansionSymbol = expansionSymbol;
        this.textBox = textBox;
        this.artistInfo = artistInfo;
        this.collectorNum = collectorNum;
        this.powerTough = powerTough;
    }
}
