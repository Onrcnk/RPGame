package academy.learnprogramming.fight;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

public class BossFight extends Fight {

    @Override
    public void startFight(BaseCharacter character, BaseBoss boss) {

        while(!checkFirstPhaseFightStatus(character, boss)) {
            attackTypeChoose(character, boss);
            if(letCharacterEscape(character, boss)) {
                return;
            }
        }
    }

    public void secondPhaseFight(BaseCharacter character,BaseBoss boss){
        while(!checkSecondPhaseFightStatus(character, boss)) {
            attackTypeChoose(character, boss);
            if(letCharacterEscape(character, boss)) {
                return;
            }
        }
    }

    public void getCombat(BaseCharacter character, BaseBoss boss){
        boss.bossIntroduction();
        startFight(character, boss);
        if(character.isEscape()){
            return;
        }
        boss.secondBossPhaseStatsUp(boss);
        boss.secondPhaseIntroduction();
        secondPhaseFight(character, boss);
        printFinalFightResult(character, boss);
    }
}
