package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

import java.util.HashMap;

public class MaskOfFear implements Item{
    String name = "Mask of Fear";
    int blockChance = 2;
    int dodgeChance = 2;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> maskOfFear = new HashMap<>();
        maskOfFear.put("blockChance", blockChance);
        maskOfFear.put("dodgeChance", dodgeChance);
        return maskOfFear;
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
            System.out.println("No one can die of fear but can get some scar! Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
