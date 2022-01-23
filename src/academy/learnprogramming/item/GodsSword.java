package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

import java.util.HashMap;

public class GodsSword implements Item{
    String name = "God's Sword";
    int attack = 70;
    int criticalChance = 2;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> godsSword = new HashMap<>();
        godsSword.put("attack", attack);
        godsSword.put("criticalChance", criticalChance);
        return godsSword;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean cast(BaseCharacter character, BaseBoss boss, int turn) {
        if (specialAttackThreeCount == 0) {
            int hp;
            hp = boss.getHp() - character.getAttack() * 5;
            boss.setHp(hp);
            System.out.println("Mighty God of this sword, there is neither fire nor lightning, there is only wrath of humble me!! Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
