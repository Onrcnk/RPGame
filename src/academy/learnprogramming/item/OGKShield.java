package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
@Getter
@Setter
public class OGKShield implements Item{
    String name = "OGK Shield";
    int blockChance = 1;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> OGKShield = new HashMap<>();
        OGKShield.put("blockChance", blockChance);
        return OGKShield;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean cast(BaseCharacter character, BaseBoss boss, int turn) {
        if (specialAttackThreeCount == 0) {
            character.setHp(character.getHp() + 50);
            System.out.println("Mighty Oguz, I know there is only way to protection and that way going through the your ass! Character Remain = " + character.getHp());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
