package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class AMKSword implements Item{
    String name = "AMKSword";
    int attack = 20;
    int blockChance = 0;
    int specialAttackThreeCount = 0;

    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> AMKSwordStat = new HashMap<>();
        AMKSwordStat.put("attack", attack);
        AMKSwordStat.put("blockChance", blockChance);
        return AMKSwordStat;
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean cast(BaseCharacter character, BaseBoss boss, int turn) {
        if(specialAttackThreeCount == 0) {
            int hp;
            hp = boss.getHp() - character.getAttack() * 2;
            boss.setHp(hp);
            System.out.println("Your sword cut your enemy's ankle! Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        }else {
            System.out.println("Make another choose");
            return false;
        }
    }

}
