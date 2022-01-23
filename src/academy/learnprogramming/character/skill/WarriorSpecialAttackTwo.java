package academy.learnprogramming.character.skill;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

public class WarriorSpecialAttackTwo implements Skill {
    int specialAttackOneCount = 0;
    int key = 0;

    public void setSpecialAttackOneCount(int specialAttackOneCount){
        this.specialAttackOneCount = specialAttackOneCount;
    }

    @Override
    public boolean cast(BaseCharacter character, BaseBoss boss) {
        if (specialAttackOneCount == 0) {
            character.setAttack(character.getAttack() + 20);
            System.out.println("Your sword covered with light and got bigger than before." + System.lineSeparator() + "You felt like there is only way to end this fight and your sword is the key of this way." + System.lineSeparator() + "Push and shake, only that can bring you victory."
                    + System.lineSeparator() + System.lineSeparator() + "Your Attack Increase." +System.lineSeparator());
            specialAttackOneCount++;
            return true;
        }else if (key == 1) {
            specialAttackOneCount = 0;
            return true;
        }else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
