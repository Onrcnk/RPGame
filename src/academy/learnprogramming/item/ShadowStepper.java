package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

import java.util.HashMap;

public class ShadowStepper implements Item{
    String name = "Shadow Stepper";
    int dodgeChance = 3;
    int criticalChance = 5;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> shadowStepper = new HashMap<>();
        shadowStepper.put("dodgeChance", dodgeChance);
        shadowStepper.put("criticalChance", criticalChance);
        return shadowStepper;
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
            System.out.println("First step to ground, second step to air and I am on the shadow with third step! Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
