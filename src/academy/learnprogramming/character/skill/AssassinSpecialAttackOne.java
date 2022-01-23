package academy.learnprogramming.character.skill;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

public class AssassinSpecialAttackOne implements Skill{
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
            System.out.println("Your hands are quick, your steps are weightless but most importantly your weapon is sharper than usual." + System.lineSeparator() + "Do you wanna pour some blood with it?" + System.lineSeparator()
                    + System.lineSeparator() + "Remain Demon Hp= " + boss.getHpStatus() + System.lineSeparator());
            specialAttackOneCount++;
            return true;
        }else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
