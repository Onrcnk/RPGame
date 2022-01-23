package academy.learnprogramming.character.skill;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

public class TankSpecialAttackTwo implements Skill {
    int specialAttackOneCount = 0;


    public void setSpecialAttackOneCount(int specialAttackOneCount){
        this.specialAttackOneCount = specialAttackOneCount;
    }

    @Override
    public boolean cast(BaseCharacter character, BaseBoss boss) {
        if (specialAttackOneCount == 0) {
            character.setBlockChance(character.getBlockChance() + 2);
            System.out.println("Does the weapon, which you wield, protect you against your enemies?" + System.lineSeparator() + "Or there is something different as you expect." + System.lineSeparator() + "Are you starting to understand what happened now?." + System.lineSeparator() + "Yes, it is the will of faith."
                    + System.lineSeparator() + System.lineSeparator() +"Your Block Chance Increase."+ System.lineSeparator());
            specialAttackOneCount++;
            return true;
        } else {
            System.out.println("Make another choose");
            return false;
        }
    }
}