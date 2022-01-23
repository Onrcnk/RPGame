package academy.learnprogramming.boss;

import java.util.Scanner;

public class BossOne extends BaseBoss{

    public BossOne() {
        this.hp = 700;
        this.attack = 40;
        this.criticalChance = 0;
    }

    @Override
    public void bossIntroduction() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("You are on the path for a long time.");
        scanner.nextLine();
        System.out.println("But after a while you realize something is wrong.");
        scanner.nextLine();
        System.out.println("First a few leaves, then a bunch of leaves begin to fall on you from the sky.");
        scanner.nextLine();
        System.out.println("When you look up at the top of the trees standing right above you, you see a figure resembling a huge gorilla coming towards you.");
        scanner.nextLine();
        System.out.println("As the creature gets closer, you begin to see its features more clearly.");
        scanner.nextLine();
        System.out.println("Disproportionate limbs...");
        scanner.nextLine();
        System.out.println("an abdomen covered with edema from the chest to the groin...");
        scanner.nextLine();
        System.out.println("and a head that is unrelated to his body.");
        scanner.nextLine();
        System.out.println("You feel fear and disgust together.");
        scanner.nextLine();
        System.out.println("You think this must be one of the demons that that imaginary voice you heard was talking about.");
        scanner.nextLine();
        System.out.println("Anyway, only a few seconds until the devil lands.");
        scanner.nextLine();
        System.out.println("Now you have to defend yourself.");
        scanner.nextLine();
    }

    @Override
    public void secondPhaseIntroduction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You're bursting the edema in the devil's stomach.");
        scanner.nextLine();
        System.out.println("You managed to deal a big blow to the devil.");
        scanner.nextLine();
        System.out.println("However, when you see two more hands coming out of the wound you have opened, you realize that fight is about to get difficult.");
        scanner.nextLine();
    }

    @Override
    public void secondBossPhaseStatsUp(BaseBoss boss) {
        boss.setAttack(boss.getAttack() + 30);
        boss.setCriticalChance(5);
    }

}
