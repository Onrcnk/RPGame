package academy.learnprogramming.boss;

import java.util.Scanner;

public class BossThree extends BaseBoss{

    public BossThree() {
        this.hp = 900;
        this.attack = 90;
        this.criticalChance = 0;
    }

    @Override
    public void bossIntroduction() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("You pull yourself together and hit the road again.");
        scanner.nextLine();
        System.out.println("As you reach the top, you see a figure sitting in the middle of a wide clearing.");
        scanner.nextLine();
        System.out.println("As you approach, the figure begins to stand up.");
        scanner.nextLine();
        System.out.println("The figure begins to rise as you approach, and soon turns into a shapeless lump of flesh at least four times your length.");
        scanner.nextLine();
        System.out.println("You think this is the most disgusting demon ever.");
        scanner.nextLine();
        System.out.println("This thing, which has neither head, arms, nor legs, is nothing but a bloody and smelly edema that digests everything that comes its way.");
        scanner.nextLine();
        System.out.println("You need to eliminate the devil, which is an insult to life, as soon as possible.");
        scanner.nextLine();
        System.out.println("This time you will have to swing your weapon to attack, not to defend.");
    }

    @Override
    public void secondPhaseIntroduction() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("With each damage you inflicted, you ripped another piece of the sickly meat from the demon.");
        scanner.nextLine();
        System.out.println("But you soon realize that you made a mistake.");
        scanner.nextLine();
        System.out.println("Thanks to you, the demon imprisoned in its own limbo is freed from her chains and comes out of her cocoon.");
        scanner.nextLine();
        System.out.println("The demon, which started to float above you with its butterfly-like wings and human body, is now much more dangerous.");
        scanner.nextLine();
    }

    @Override
    public void secondBossPhaseStatsUp(BaseBoss boss) {
        boss.setAttack(boss.getAttack() + 100);
        boss.setCriticalChance(7);
    }

    public void afterFightEvent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************************************************************");
        System.out.print("The devil is dying before your eyes.");
        scanner.nextLine();
        System.out.print("Just as demon is about to fall to the ground, you hear its muttering a few words, but with the excitement of the moment, you cannot make sense of them.");
        scanner.nextLine();
        System.out.print("'On** *rue *****vers *an pass t*** *r***'");
        scanner.nextLine();
        System.out.println("Anyway, you come back to yourself after your excitement has passed.");
        System.out.println("*****************************************************************************");
        scanner.nextLine();
    }

}