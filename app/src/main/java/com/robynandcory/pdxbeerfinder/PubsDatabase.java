package com.robynandcory.pdxbeerfinder;

import java.util.ArrayList;

public class PubsDatabase extends ArrayList{
    private ArrayList<Pub> PubsDatabase = new ArrayList<>();

    public ArrayList<Pub> getPubsDatabase() {
        PubsDatabase.add(new Pub("Pine St. Market", "Restaurant", true, R.drawable.pinestreetmarket));
        PubsDatabase.add(new Pub("Lardo", "Restaurant", true, R.drawable.lardo));
        PubsDatabase.add(new Pub("Smokehouse Tavern", "Restaurant", true, R.drawable.smokehousetavern));
        PubsDatabase.add(new Pub("Toffee Club", "Restaurant", true, R.drawable.toffeeclub));
        PubsDatabase.add(new Pub("Lardo", "Bar", true, R.drawable.lardo));
        PubsDatabase.add(new Pub("HOME Bar", "Bar", true, R.drawable.homebar));
        PubsDatabase.add(new Pub("Loyal Legion", "Bar", true, R.drawable.loyallegion));
        PubsDatabase.add(new Pub("Craft Pour House", "Bar", true, R.drawable.craftpourhouse));
        PubsDatabase.add(new Pub("Toffee Club", "Bar", true, R.drawable.toffeeclub));
        PubsDatabase.add(new Pub("SpaceRoom", "Bar", true, R.drawable.spaceroom));
        PubsDatabase.add(new Pub("Wayfinder", "Brewery", true, R.drawable.lardo));
        PubsDatabase.add(new Pub("Culmination", "Brewery", true, R.drawable.culmination));
        PubsDatabase.add(new Pub("Pfriem", "Brewery", true, R.drawable.pfriem));
        return PubsDatabase;
    }
}
