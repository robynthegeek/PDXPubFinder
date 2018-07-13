package com.robynandcory.pdxbeerfinder;

import java.util.ArrayList;

public class PubsDatabase {

    final String restaurant = AppContext.getContext().getString(R.string.restaurant);
    final String bar = AppContext.getContext().getString(R.string.bar);
    final String brewery = AppContext.getContext().getString(R.string.brewery);
    final String store = AppContext.getContext().getString(R.string.store);

    public ArrayList<Pub> getRestaurantsDatabase() {
        ArrayList<Pub> restaurants = new ArrayList<>();
        restaurants.add(new Pub(AppContext.getContext().getString(R.string.smokehouse), restaurant, false, R.drawable.smokehousetavern));
        restaurants.add(new Pub(AppContext.getContext().getString(R.string.toffee), restaurant, true, R.drawable.toffeeclub));
        restaurants.add(new Pub(AppContext.getContext().getString(R.string.lardo), restaurant, false, R.drawable.lardo));
        restaurants.add(new Pub(AppContext.getContext().getString(R.string.pinest), restaurant, true, R.drawable.pinestreetmarket));
        return restaurants;
    }

    public ArrayList<Pub> getBarsDatabase() {
        ArrayList<Pub> bars = new ArrayList<>();
        bars.add(new Pub(AppContext.getContext().getString(R.string.loyal), bar, false, R.drawable.loyallegion));
        bars.add(new Pub(AppContext.getContext().getString(R.string.craftpourhouse), bar, false, R.drawable.craftpourhouse));
        bars.add(new Pub(AppContext.getContext().getString(R.string.HOME), bar, true, R.drawable.homebar));
        bars.add(new Pub(AppContext.getContext().getString(R.string.toffeeclub), bar, true, R.drawable.toffeeclub));
        bars.add(new Pub(AppContext.getContext().getString(R.string.spaceroom), bar, false, R.drawable.spaceroom));
        return bars;
    }

    public ArrayList<Pub> getBreweriesDatabase() {
        ArrayList<Pub> breweries = new ArrayList<>();
        breweries.add(new Pub(AppContext.getContext().getString(R.string.wayfinder), brewery, false, R.drawable.wayfinder));
        breweries.add(new Pub(AppContext.getContext().getString(R.string.culmination), brewery, false, R.drawable.culmination));
        breweries.add(new Pub(AppContext.getContext().getString(R.string.pfriem), brewery, true, R.drawable.pfriem));
        return breweries;
    }

    public ArrayList<Pub> getStoresDatabase() {
        ArrayList<Pub> stores = new ArrayList<>();
        stores.add(new Pub(AppContext.getContext().getString(R.string.johns), store, true, R.drawable.johnsmarketplace));
        stores.add(new Pub(AppContext.getContext().getString(R.string.belmont), store, true, R.drawable.belmontstation));
        stores.add(new Pub(AppContext.getContext().getString(R.string.imperial), store, true, R.drawable.imperialbottleshop));
        return stores;
    }
}
