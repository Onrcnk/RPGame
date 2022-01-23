package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

import java.util.HashMap;

public class IronIngot implements Item{
    String name = "Iron Ingot";
    int attack = 70;
    int blockChance = 2;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> ironIngot = new HashMap<>();
        ironIngot.put("attack", attack);
        ironIngot.put("blockChance", blockChance);
        return ironIngot;
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
            System.out.println("Raise your head, if you want to meet your Reaper! Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
