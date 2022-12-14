package com.duartesgoncalves.designpatterns;

public interface StringTransformer {
    void execute(StringDrink drink);

    void undo(StringDrink drink);
}
