package com.duartesgoncalves.designpatterns;

public class StringInverter implements StringTransformer {
    public void execute(StringDrink string) {
        StringBuilder newString = new StringBuilder(string.getText());
        newString.reverse();
        string.setText(newString.toString());
    }
}
