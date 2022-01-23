package academy.learnprogramming.character;

import academy.learnprogramming.character.skill.AssassinSpecialAttackOne;
import academy.learnprogramming.character.skill.AssassinSpecialAttackTwo;
import academy.learnprogramming.item.*;

import java.util.Scanner;

public class Assassin extends BaseCharacter {

    public Assassin() {
        this.baseHp = 700;
        this.baseAttack = 60;
        this.baseCriticalChance = 5;
        this.baseBlockChance = 2;
        this.baseDodgeChance = 4;
        this.hp = 700;
        this.attack = 60;
        this.criticalChance = 5;
        this.blockChance = 2;
        this.dodgeChance = 4;
        this.skillOne = new AssassinSpecialAttackOne();
        this.skillTwo = new AssassinSpecialAttackTwo();
    }

    public void firstWeaponChose(BaseCharacter character) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************************************");
        System.out.println("Which one do you choose?" + System.lineSeparator() +
                "(1) BGS Blade: Increase Attack" + System.lineSeparator() +
                "(2) Shifty Boots: Increase Dodge Chance");
        System.out.println("*******************************************************");
        boolean validTwo = true;
        while (validTwo) {
            int secondChooseOne = scanner.nextInt();
            System.out.println("");
            switch (secondChooseOne) {
                case 1:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the blade." + System.lineSeparator() +
                            "After your hesitation has passed, you take the blade in your hand and take a look." + System.lineSeparator() +
                            "The blade is quite sharp and eye-catching." + System.lineSeparator() +
                            "You seem pretty happy with your decisions.");
                    BGSBlade bgsBlade = new BGSBlade();
                    bgsBlade.setAttack(40);
                    character.equipWeapon(bgsBlade);
                    validTwo = false;
                    break;
                case 2:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the boots." + System.lineSeparator() +
                            "After your hesitation has passed, you take the boots in your hand and take a look." + System.lineSeparator() +
                            "The boots is quite light and durable." + System.lineSeparator() +
                            "You seem pretty happy with your decisions.");
                    ShiftyBoots shiftyBoots = new ShiftyBoots();
                    shiftyBoots.setDodgeChance(2);
                    character.equipWeapon(shiftyBoots);
                    validTwo = false;
                    break;
                default:
                    System.out.println("Choose 1 or 2, idiot.");
                    break;
            }
        }
    }

    public void firstWeaponChoseAlternative(BaseCharacter character){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************************************");
        System.out.println("Which one do you choose?" + System.lineSeparator() +
                "(1) BGS Blade: Increase Attack" + System.lineSeparator() +
                "(2) Shifty Boots: Increase Dodge Chance");
        System.out.println("*******************************************************");
        boolean validTwo = true;
        while(validTwo) {
            int secondChooseTwo = scanner.nextInt();
            System.out.println("");
            switch (secondChooseTwo) {
                case 1:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the blade." + System.lineSeparator() +
                            "After your hesitation has passed, you take the blade in your hand and take a look." + System.lineSeparator() +
                            "The blade is quite rusty and unpretentious." + System.lineSeparator() +
                            "You seem pretty dissatisfied with your decisions.");
                    BGSBlade bgsBlade = new BGSBlade();
                    character.equipWeapon(bgsBlade);
                    validTwo = false;
                    break;
                case 2:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the boots." + System.lineSeparator() +
                            "After your hesitation has passed, you take the boots in your hand and take a look." + System.lineSeparator() +
                            "The boots is quite dusty and unpretentious." + System.lineSeparator() +
                            "You seem pretty dissatisfied with your decisions.");
                    ShiftyBoots shiftyBoots = new ShiftyBoots();
                    character.equipWeapon(shiftyBoots);
                    validTwo = false;
                    break;
                default:
                    System.out.println("Choose 1 or 2, idiot.");
                    break;
            }
        }
    }

    public void secondWeaponChose(BaseCharacter character){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("");
        System.out.println("You suddenly see a chest appearing when a little after you get away from the devil and you hesitantly open it.");
        scanner.nextLine();
        System.out.println("Inside the chest you see two more different weapons.");
        scanner.nextLine();
        System.out.println("*******************************************************");
        System.out.println("Which one do you choose?"+ System.lineSeparator() +
                "(1) Blood Runner: Increase Attack and Critical Chance" + System.lineSeparator() +
                "(2) Mask of Fear: Increase Block and Dodge Chance");
        System.out.println("*******************************************************");
        boolean valid = true;
        while (valid) {
            int choose = scanner.nextInt();
            System.out.println("");
            switch (choose) {
                case 1:
                    System.out.println("You chose the Blood Runner.");
                    BloodRunner bloodRunner = new BloodRunner();
                    character.equipWeapon(bloodRunner);
                    valid = false;
                    break;
                case 2:
                    System.out.println("You chose the Mask of Fear.");
                    MaskOfFear maskOfFear = new MaskOfFear();
                    character.equipWeapon(maskOfFear);
                    valid = false;
                    break;
                default:
                    System.out.println("Choose 1 or 2, idiot.");
                    break;
            }
        }
        System.out.println("And other one disappear again.");
        scanner.nextLine();
        System.out.println("You think it's useless to think about what's going on and move on.");
        scanner.nextLine();
    }

    public void thirdWeaponChose(BaseCharacter character){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("You suddenly see a chest appearing when a little after you get away from the devil and you hesitantly open it.");
        scanner.nextLine();
        System.out.println("Inside the chest you see two more different weapons.");
        scanner.nextLine();
        System.out.println("*******************************************************");
        System.out.println("Which one do you choose?" + System.lineSeparator() +
                "(1) Dangger: Increase Attack and Critical Chance" + System.lineSeparator() +
                "(2) Shadow Stepper: Increase Critical and Dodge Chance");
        System.out.println("*******************************************************");
        System.out.println("");
        boolean valid = true;
        while (valid) {
            int choose = scanner.nextInt();
            System.out.println("");
            switch (choose) {
                case 1:
                    System.out.println("You chose the Dangger.");
                    Dangger dangger = new Dangger();
                    character.equipWeapon(dangger);
                    valid = false;
                    break;
                case 2:
                    System.out.println("You chose the Shadow Stepper.");
                    ShadowStepper shadowStepper = new ShadowStepper();
                    character.equipWeapon(shadowStepper);
                    valid = false;
                    break;
                default:
                    System.out.println("Choose 1 or 2, idiot.");
                    break;
            }
        }
        System.out.println("And other one disappear again.");
        scanner.nextLine();
        System.out.println("You think it's useless to think about what's going on and move on.");
    }

}
