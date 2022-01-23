package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class ShiftyBoots implements Item{
    String name = "Shifty Boots";
    int dodgeChance = 1;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> shiftyBoots = new HashMap<>();
        shiftyBoots.put("dodgeChance", dodgeChance);
        return shiftyBoots;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean cast(BaseCharacter character, BaseBoss boss, int turn) {
        if (specialAttackThreeCount == 0) {
            int hp;
            hp = boss.getHp() - character.getAttack() * 2;
            boss.setHp(hp);
            System.out.println("Can you see me? Can you see me? Can you s... Just kidding, I already untie your belt! Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
