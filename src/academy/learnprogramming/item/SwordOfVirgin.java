package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class SwordOfVirgin implements Item{
    String name = "Sword of Virgin";
    int criticalChance = 1;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> swordOfVirgin = new HashMap<>();
        swordOfVirgin.put("criticalChance", criticalChance);
        return swordOfVirgin;
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
            System.out.println("My Queen and Goddess, am I the only one left without sin? Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
