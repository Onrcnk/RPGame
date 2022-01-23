package academy.learnprogramming.story;


import academy.learnprogramming.boss.BossOne;
import academy.learnprogramming.boss.BossThree;
import academy.learnprogramming.boss.BossTwo;
import academy.learnprogramming.character.BaseCharacter;
import academy.learnprogramming.fight.BossFight;


public class Story {

        public void storyLine() {
            boolean isDie = false;
            while(!isDie) {
                StoryHelper story = new StoryHelper();
                story.storyIntro();
                story.imaginaryVoiceEvent();
                BaseCharacter character = story.chooseClass();
                story.storyFirstEvent(character);
                BossOne bossOne = new BossOne();
                BossFight fight = new BossFight();
                fight.getCombat(character, bossOne);
                if(character.getHp() <= 0){
                    System.out.println("");
                    System.out.println("You should try again!");
                    isDie = true;
                    return;
                }
                fight.endFight(character);
                character.secondWeaponChose(character);
                story.campEvents(character);
                if(character.getHp() <= 0){
                    System.out.println("");
                    System.out.println("You should try again!");
                    isDie = true;
                    return;
                }
                fight.endFight(character);
                story.storySecondEvent();
                BossTwo bossTwo = new BossTwo();
                fight.getCombat(character, bossTwo);
                if(character.getHp() <= 0){
                    System.out.println("");
                    System.out.println("You should try again!");
                    isDie = true;
                    return;
                }
                fight.endFight(character);
                character.thirdWeaponChose(character);
                story.campEvents(character);
                if(character.getHp() <= 0){
                    System.out.println("");
                    System.out.println("You should try again!");
                    isDie = true;
                    return;
                }
                BossThree bossThree = new BossThree();
                fight.getCombat(character, bossThree);
                if(character.getHp() <= 0){
                    System.out.println("");
                    System.out.println("You should try again!");
                    isDie = true;
                    return;
                }
                fight.endFight(character);
                bossThree.afterFightEvent();
                story.storyThirdEvent();
                isDie = true;
            }
        }
}
