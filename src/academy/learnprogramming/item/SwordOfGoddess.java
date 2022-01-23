package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

import java.util.HashMap;

public class SwordOfGoddess implements Item{
    String name = "Sword of Goddess";
    int attack = 50;
    int criticalChance = 2;
    int blockChance = 2;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> swordOfGoddess = new HashMap<>();
        swordOfGoddess.put("attack", attack);
        swordOfGoddess.put("criticalChance", criticalChance);
        swordOfGoddess.put("blockChance", blockChance);
        return swordOfGoddess;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean cast(BaseCharacter character, BaseBoss boss, int turn) {
        if (specialAttackThreeCount == 0) {
            int hp;
            hp = boss.getHp() - character.getAttack() * 4;
            boss.setHp(hp);
            System.out.println("Mother of God, give me a power of your justice! Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
