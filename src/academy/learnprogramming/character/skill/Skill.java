package academy.learnprogramming.character.skill;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

public interface Skill {

    void setSpecialAttackOneCount(int specialAttackOneCount);
    boolean cast(BaseCharacter character, BaseBoss boss);

}
