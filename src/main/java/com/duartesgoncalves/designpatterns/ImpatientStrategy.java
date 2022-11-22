package com.duartesgoncalves.designpatterns;

public class ImpatientStrategy implements OrderingStrategy {
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink, recipe);
    }

    public void happyHourStarted(StringBar bar) {
        bar.startHappyHour();
    }

    public void happyHourEnded(StringBar bar) {
        bar.endHappyHour();
    }
}
