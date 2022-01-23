package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class BGSBlade implements Item{
    String name = "BGS Blade";
    int attack = 30;
    int specialAttackThreeCount = 0;

    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> BGSBlade = new HashMap<>();
        BGSBlade.put("attack", attack);
        return BGSBlade;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean cast(BaseCharacter character, BaseBoss boss, int turn) {
        if(specialAttackThreeCount == 0) {
            int hp;
            hp = boss.getHp() - character.getAttack() * 2;
            boss.setHp(hp);
            System.out.println("What is the most valuable thing, it's gold or it's family? No it's Burak's ass! Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        }else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
