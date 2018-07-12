package com.robynandcory.pdxbeerfinder;

import java.util.ArrayList;

public class PubsDatabase {

    public ArrayList<Pub> getPubsDatabase() {
        ArrayList<Pub> pubs = new ArrayList<>();
        pubs.add(new Pub("Pine St. Market", "Restaurant", true, R.drawable.pinestreetmarket));
        pubs.add(new Pub("Lardo", "Restaurant", true, R.drawable.lardo));
        pubs.add(new Pub("Smokehouse Tavern", "Restaurant", true, R.drawable.smokehousetavern));
        pubs.add(new Pub("Toffee Club", "Restaurant", true, R.drawable.toffeeclub));
        pubs.add(new Pub("Lardo", "Bar", true, R.drawable.lardo));
        pubs.add(new Pub("HOME Bar", "Bar", true, R.drawable.homebar));
        pubs.add(new Pub("Loyal Legion", "Bar", true, R.drawable.loyallegion));
        pubs.add(new Pub("Craft Pour House", "Bar", true, R.drawable.craftpourhouse));
        pubs.add(new Pub("Toffee Club", "Bar", true, R.drawable.toffeeclub));
        pubs.add(new Pub("SpaceRoom", "Bar", true, R.drawable.spaceroom));
        pubs.add(new Pub("Wayfinder", "Brewery", true, R.drawable.lardo));
        pubs.add(new Pub("Culmination", "Brewery", true, R.drawable.culmination));
        pubs.add(new Pub("Pfriem", "Brewery", true, R.drawable.pfriem));
        return pubs;
    }
}
