package com.duartesgoncalves.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {
    private List<StringDrink> drinks = new ArrayList<>();
    private List<StringRecipe> recipes = new ArrayList<>();

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) {
            bar.order(drink, recipe);
        } else {
            drinks.add(drink);
            recipes.add(recipe);
        }
    }

    public void happyHourStarted(StringBar bar) {
        for (int i = 0; i < drinks.size(); i++) {
            bar.order(drinks.get(i), recipes.get(i));
        }
    }

    public void happyHourEnded(StringBar bar) {
        drinks.clear();
        recipes.clear();
    }
}
