package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class BloodRunner implements Item{
    String name = "Blood Runner";
    int attack = 50;
    int criticalChance = 2;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> bloodRunner = new HashMap<>();
        bloodRunner.put("attack", attack);
        bloodRunner.put("criticalChance", criticalChance);
        return bloodRunner;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean cast(BaseCharacter character, BaseBoss boss, int turn) {
        if(specialAttackThreeCount == 0) {
            int hp;
            hp = boss.getHp() - character.getAttack() * 3;
            boss.setHp(hp);
            System.out.println("Blood Runner, the shadow of fiercely Nile pierced his enemy's shoulder. Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        }else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
