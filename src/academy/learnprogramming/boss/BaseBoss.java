package academy.learnprogramming.boss;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseBoss{
    int hp;
    int attack;
    int criticalChance;
    int blockChance;
    int dodgeChance;

    public int getHpStatus(){
        return Math.max(getHp(), 0);
    }

    public abstract  void bossIntroduction();

    public abstract void secondPhaseIntroduction();

    public abstract void secondBossPhaseStatsUp(BaseBoss boss);


}
