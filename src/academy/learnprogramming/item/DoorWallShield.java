package academy.learnprogramming.item;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

import java.util.HashMap;

public class DoorWallShield implements Item{
    String name = "Door-Wall Shield";
    int hp = 40;
    int blockChance = 2;
    int specialAttackThreeCount = 0;


    @Override
    public HashMap<String, Integer> getStats() {
        HashMap<String, Integer> doorWallShield = new HashMap<>();
        doorWallShield.put("hp", hp);
        doorWallShield.put("blockChance", blockChance);
        return doorWallShield;
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
            character.setHp(character.getHp() + 50);
            System.out.println("You rise your shield up and feel safe. Character Remain = " + character.getHp());
            System.out.println("After then hit your shield to ground with self-confidence! Demon Remain = " + boss.getHpStatus());
            specialAttackThreeCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
