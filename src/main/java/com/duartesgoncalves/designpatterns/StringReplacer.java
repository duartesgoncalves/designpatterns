package com.duartesgoncalves.designpatterns;

public class StringReplacer implements StringTransformer {
    private final char c1, c2;

    public StringReplacer(char c1, char c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public void execute(StringDrink string) {
        StringBuilder newString = new StringBuilder();
        String text = string.getText();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == this.c1) newString.append(c2);
            else newString.append(text.charAt(i));
        }

        string.setText(newString.toString());
    }

    public void undo(StringDrink string) {
        StringBuilder newString = new StringBuilder();
        String text = string.getText();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == this.c2) newString.append(c1);
            else newString.append(text.charAt(i));
        }

        string.setText(newString.toString());
    }
}
