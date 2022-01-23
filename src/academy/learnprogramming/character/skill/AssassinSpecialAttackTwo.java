package academy.learnprogramming.character.skill;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;


public class AssassinSpecialAttackTwo implements Skill{
    int specialAttackOneCount = 0;

    public void setSpecialAttackOneCount(int specialAttackOneCount){
        this.specialAttackOneCount = specialAttackOneCount;
    }

    @Override
    public boolean cast(BaseCharacter character, BaseBoss boss) {
        if (specialAttackOneCount == 0) {
            character.setCriticalChance(character.getCriticalChance() + 2);
            System.out.println("Step by step, second by second, you begin to feel an emptiness deep within your soul." + System.lineSeparator() + "Does this also come from God, the creator of even darkness?"
                    + System.lineSeparator() + "Let be the silent, be the shadow, be the no one." + System.lineSeparator()
                    + System.lineSeparator() + "Your Critical Chance Increase." + System.lineSeparator());
            specialAttackOneCount++;
            return true;
        }else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
