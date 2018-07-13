package com.robynandcory.pdxbeerfinder;

import java.util.ArrayList;

public class PubsDatabase {

    public ArrayList<Pub> getRestaurantsDatabase() {
        ArrayList<Pub> restaurants = new ArrayList<>();
        restaurants.add(new Pub("Smokehouse Tavern", "Restaurant", true, R.drawable.smokehousetavern));
        restaurants.add(new Pub("Toffee Club", "Restaurant", true, R.drawable.toffeeclub));
        restaurants.add(new Pub("Lardo", "Restaurant", true, R.drawable.lardo));
        restaurants.add(new Pub("Pine St. Market", "Restaurant", true, R.drawable.pinestreetmarket));
        return restaurants;
    }

    public ArrayList<Pub> getBarsDatabase() {
        ArrayList<Pub> bars = new ArrayList<>();
        bars.add(new Pub("HOME Bar", "Bar", true, R.drawable.homebar));
        bars.add(new Pub("Loyal Legion", "Bar", true, R.drawable.loyallegion));
        bars.add(new Pub("Craft Pour House", "Bar", true, R.drawable.craftpourhouse));
        bars.add(new Pub("Toffee Club", "Bar", true, R.drawable.toffeeclub));
        bars.add(new Pub("SpaceRoom", "Bar", true, R.drawable.spaceroom));
        return bars;
    }

    public ArrayList<Pub> getBreweriesDatabase() {
        ArrayList<Pub> breweries = new ArrayList<>();
        breweries.add(new Pub("Wayfinder", "Brewery", true, R.drawable.wayfinder));
        breweries.add(new Pub("Culmination", "Brewery", true, R.drawable.culmination));
        breweries.add(new Pub("Pfriem", "Brewery", true, R.drawable.pfriem));
        return breweries;
    }

    public ArrayList<Pub> getStoreDatabase() {
        ArrayList<Pub> stores = new ArrayList<>();
        stores.add(new Pub("John's Marketplace", "Store", true, R.drawable.johnsmarketplace));
        stores.add(new Pub("Belmont Station", "Store", true, R.drawable.belmontstation));
        stores.add(new Pub("Imperial Bottle Shop", "Store", true, R.drawable.imperialbottleshop));
        return stores;
    }
}
