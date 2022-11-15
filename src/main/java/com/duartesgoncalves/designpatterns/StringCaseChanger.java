package com.duartesgoncalves.designpatterns;

public class StringCaseChanger implements StringTransformer {
    public void execute(StringDrink string) {
        StringBuilder newString = new StringBuilder();
        String text = string.getText();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLowerCase(c)) c = Character.toUpperCase(c);
            else c = Character.toLowerCase(c);

            newString.append(c);
        }

        string.setText(newString.toString());
    }
}
