package academy.learnprogramming.character.skill;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

public class WarriorSpecialAttackOne implements Skill{
    int specialAttackOneCount = 0;

    public void setSpecialAttackOneCount(int specialAttackOneCount){
        this.specialAttackOneCount = specialAttackOneCount;
    }

    @Override
    public boolean cast(BaseCharacter character, BaseBoss boss) {
        if(specialAttackOneCount == 0) {
            int hp;
            hp = boss.getHp() - character.getAttack() * 2;
            boss.setHp(hp);
            System.out.println("Who can judge you?" + System.lineSeparator() + "Who can punish you?" + System.lineSeparator() + "In here, just one can do it and it is you."
                    + System.lineSeparator() + "Take your fear, take your anger and take your faith" + System.lineSeparator() + "and give the bottomless scar to your enemy." + System.lineSeparator()
                    +  System.lineSeparator() + "Remain Demon Hp = " + boss.getHpStatus() + System.lineSeparator());
            specialAttackOneCount++;
            return true;
        }else {
            System.out.println("Make another choose");
            return false;
        }

    }
}
