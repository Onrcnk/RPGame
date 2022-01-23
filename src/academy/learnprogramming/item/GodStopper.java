package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

import java.util.HashMap;

public class GodStopper implements Item{
    String name = "God-Stopper";
    int blockChance = 3;
    int dodgeChance = 3;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> godStopper = new HashMap<>();
        godStopper.put("blockChance", blockChance);
        godStopper.put("dodgeChance", dodgeChance);
        return godStopper;
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
            character.setHp(character.getHp() + 200);
            System.out.println("Enemy of the God, give me some help. Character Remain = " + character.getHp());
            System.out.println("And send a fire of your dreadful hell. Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
