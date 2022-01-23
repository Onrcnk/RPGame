package academy.learnprogramming.boss;

import java.util.Scanner;

public class BossTwo extends BaseBoss{

    public BossTwo() {
        this.hp = 800;
        this.attack = 70;
        this.criticalChance = 0;
    }


    @Override
    public void bossIntroduction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eighth legs..");
        scanner.nextLine();
        System.out.println("four arms...");
        scanner.nextLine();
        System.out.println("and two head.");
        scanner.nextLine();
        System.out.println("This devil, which looks like a spider on the bottom and a human on the top, looks like it came out of the Bible.");
        scanner.nextLine();
        System.out.println("You think there might be a better way to pray than to swing a weapon.");
        scanner.nextLine();
        System.out.println("But what can a few words do against the four fists coming towards you?");
        scanner.nextLine();
        System.out.println("You need to be on the defensive as soon as possible, with your weapon.");
        scanner.nextLine();
    }

    @Override
    public void secondPhaseIntroduction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You managed to break off the devil's four legs and two arms.");
        scanner.nextLine();
        System.out.println("Rising on her remaining four legs, the devil now looks more imposing and powerful.");
        scanner.nextLine();
        System.out.println("It seems that your opponent is more vicious and angry now.");
        scanner.nextLine();
    }

    @Override
    public void secondBossPhaseStatsUp(BaseBoss boss) {
        boss.setAttack(boss.getAttack() + 80);
        boss.setCriticalChance(6);
    }

}
