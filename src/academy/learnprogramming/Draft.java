package academy.learnprogramming;

public class Draft {

//    BaseCharacter Çöplüğü
//
//    private void basicAttack(BaseBoss boss){
//        int hp = boss.getHp() - getAttack();
//        boss.setHp(hp);
//        System.out.println("You have basic attack. Boss lost " + getAttack() + " hp point. Remain: " + boss.getHp());
//    }
//
//    private void winCondition(BaseBoss boss){
//        if(boss.getHp() <= 0) {
//            System.out.println("You Win the Battle!");
//            this.flag = false;
//        }
//    }

//    private boolean criticalAttack(BaseBoss boss){
//        if(criticalChance + Math.floor(Math.random() * 10) > 10){
//            int hp = boss.getHp() - (getAttack() * 2);
//            boss.setHp(hp);
//            System.out.println("You have critical attack. Remain: " + boss.getHp());
//            return true;
//        }
//        return false;
//    }

//    public void specialAttackOne(BaseBoss boss){
//        int hp;
//        hp = boss.getHp() - (getAttack() * 2);
//        boss.setHp(hp);
//        System.out.println("It was special attack. Boss lost " + (getAttack() * 2) + " hp point. Remain: " + boss.getHp());
//    }

//    public void fight(BaseBoss boss, BaseCharacter character){
//        Scanner scanner = new Scanner(System.in);
//        int count = 0;
//        System.out.println("You across with three headed monkey.");
//        System.out.println("Choose your action:");
//        System.out.println("(1) Basic attack");
//        System.out.println("(2) Special attack");
//        int choose = scanner.nextInt();
//        while(this.flag){
//            if(choose <= 0 || choose > 2){
//                System.out.println("Write defined option");
//                choose = scanner.nextInt();
//            }else if(choose == 2 & count == 1){
//                System.out.println("You are too tired to use this ability. Make another choose");
//                choose = scanner.nextInt();
//            }else if(choose == 2 & count < 1){
//                specialAttackOne(boss);
//                boss.attack(boss, character);
//                if(getHp() <= 0){
//                    this.flag = false;
//                }
//                count++;
//                choose = scanner.nextInt();
//            }else{
//                attack(character, boss);
//                if(boss.getHp() <= 0){
//                    this.flag = false;
//                }else {
//                    boss.attack(boss, character);
//                    choose = scanner.nextInt();
//                }
//            }
//        }
//    }

//    public boolean printFirstPhaseResult(BaseCharacter character, BaseBoss boss) {
//        if (character.getHp() <= 0) {
//            System.out.println("You Die!");
//            return false;
//        } else {
//            boss.secondPhaseIntroduction();
//        }
//        return  true;
//    }

}
