package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class Dangger implements Item{
    String name = "Dangger";
    int attack = 60;
    int criticalChance = 3;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> dangger = new HashMap<>();
        dangger.put("attack", attack);
        dangger.put("criticalChance", criticalChance);
        return dangger;
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
            System.out.println("Blood and steel, you have no choice but to die! Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
