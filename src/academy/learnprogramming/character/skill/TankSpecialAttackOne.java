package academy.learnprogramming.character.skill;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

public class TankSpecialAttackOne implements Skill{
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
            System.out.println("Do you know what will happen now?" + System.lineSeparator() + "You will start to pray and swing your weapon." + System.lineSeparator() + "After that, you will see bottomless wound on your enemy's throat." + System.lineSeparator() + System.lineSeparator() +
                    "Remain Demon Hp = " + boss.getHpStatus() + System.lineSeparator());
            specialAttackOneCount++;
            return true;
        }else {
            System.out.println("Make another choose");
            return false;
        }
    }
}
