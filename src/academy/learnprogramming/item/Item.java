package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

import java.util.HashMap;

public interface Item {
    HashMap<String, Integer> getStats();
    String getName();

    boolean cast(BaseCharacter character, BaseBoss boss, int turn);


}
