package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

import java.util.HashMap;

public class SwordOfQueen implements Item{
    String name = "Sword of Queen";
    int blockChance = 2;
    int criticalChance = 2;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> swordOfQueen = new HashMap<>();
        swordOfQueen.put("blockChance", blockChance);
        swordOfQueen.put("criticalChance", criticalChance);
        return swordOfQueen;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean cast(BaseCharacter character, BaseBoss boss, int turn) {
        if (specialAttackThreeCount == 0) {
            int hp;
            hp = boss.getHp() - character.getAttack() * 3;
            boss.setHp(hp);
            System.out.println("Neither golds nor diamonds, I just want to hear you beg! Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
