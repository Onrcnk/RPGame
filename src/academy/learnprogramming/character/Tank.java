package academy.learnprogramming.character;

import academy.learnprogramming.character.skill.TankSpecialAttackOne;
import academy.learnprogramming.character.skill.TankSpecialAttackTwo;
import academy.learnprogramming.item.*;

import java.util.Scanner;

public class Tank extends BaseCharacter{

    public Tank() {
        this.baseHp = 1200;
        this.baseAttack = 40;
        this.baseCriticalChance = 4;
        this.baseBlockChance = 5;
        this.baseDodgeChance = 2;
        this.hp = 1200;
        this.attack = 40;
        this.criticalChance = 4;
        this.blockChance = 5;
        this.dodgeChance = 2;
        this.skillOne = new TankSpecialAttackOne();
        this.skillTwo = new TankSpecialAttackTwo();
    }

    @Override
    public void firstWeaponChose(BaseCharacter character) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************************************");
        System.out.println("Which one do you choose?" + System.lineSeparator() +
                "(1) AMK Sword: Increase Attack and Block Chance" +System.lineSeparator() +
                "(2) OGK Shield: Increase Block Chance");
        System.out.println("*******************************************************");
        boolean validTwo = true;
        while (validTwo) {
            int secondChooseOne = scanner.nextInt();
            System.out.println("");
            switch (secondChooseOne) {
                case 1:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the sword." + System.lineSeparator() +
                            "After your hesitation has passed, you take the sword in your hand and take a look." + System.lineSeparator() +
                            "The sword is quite sharp and eye-catching." + System.lineSeparator() +
                            "You seem pretty happy with your decisions.");
                    AMKSword amkSword = new AMKSword();
                    amkSword.setBlockChance(1);
                    character.equipWeapon(amkSword);
                    validTwo = false;
                    break;
                case 2:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the shield." + System.lineSeparator() +
                            "After your hesitation has passed, you take the shield in your hand and take a look." + System.lineSeparator() +
                            "The shield is quite light and durable." + System.lineSeparator() +
                            "You seem pretty happy with your decisions.");
                    OGKShield ogkShield = new OGKShield();
                    ogkShield.setBlockChance(1);
                    character.equipWeapon(ogkShield);
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
                "(1) AMK Sword: Increase Attack and Block Chance" +System.lineSeparator() +
                "(2) OGK Shield: Increase Block Chance");
        System.out.println("*******************************************************");
        boolean validTwo = true;
        while(validTwo) {
            int secondChooseTwo = scanner.nextInt();
            System.out.println("");
            switch (secondChooseTwo) {
                case 1:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the sword." + System.lineSeparator() +
                            "After your hesitation has passed, you take the sword in your hand and take a look." + System.lineSeparator() +
                            "The sword is quite rusty and unpretentious." + System.lineSeparator() +
                            "You seem pretty dissatisfied with your decisions.");
                    AMKSword amkSword = new AMKSword();
                    character.equipWeapon(amkSword);
                    validTwo = false;
                    break;
                case 2:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the shield." + System.lineSeparator() +
                            "After your hesitation has passed, you take the shield in your hand and take a look." + System.lineSeparator() +
                            "The sword is quite rusty and unpretentious." + System.lineSeparator() +
                            "You seem pretty dissatisfied with your decisions.");
                    OGKShield ogkShield = new OGKShield();
                    character.equipWeapon(ogkShield);
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
        System.out.println("You suddenly see a chest appearing when a little after you get away from the devil and you hesitantly open it.");
        scanner.nextLine();
        System.out.println("Inside the chest you see two more different weapons.");
        scanner.nextLine();
        System.out.println("*******************************************************");
        System.out.println("Which one do you choose?" + System.lineSeparator() +
                "(1) Bleeder: Increase Attack and Critical Chance" + System.lineSeparator() +
                "(2) Door Wall Shield: Increase Hp and Block Chance");
        System.out.println("*******************************************************");
        boolean valid = true;
        while (valid) {
            int choose = scanner.nextInt();
            System.out.println("");
            switch (choose) {
                case 1:
                    System.out.println("You chose the Bleeder.");
                    Bleeder bleeder = new Bleeder();
                    character.equipWeapon(bleeder);
                    valid = false;
                    break;
                case 2:
                    System.out.println("You chose the Door Wall Shield.");
                    DoorWallShield doorWallShield = new DoorWallShield();
                    character.equipWeapon(doorWallShield);
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
                "(1) Iron Ingot: Increase Attack and Block Chance" + System.lineSeparator() +
                "(2) God Stopper: Increase Block and Dodge Chance");
        System.out.println("*******************************************************");
        boolean valid = true;
        while (valid) {
            int choose = scanner.nextInt();
            System.out.println("");
            switch (choose) {
                case 1:
                    System.out.println("You chose the Iron Ingot.");
                    IronIngot ironIngot = new IronIngot();
                    character.equipWeapon(ironIngot);
                    valid = false;
                    break;
                case 2:
                    System.out.println("You chose the God Stopper.");
                    GodStopper godStopper = new GodStopper();
                    character.equipWeapon(godStopper);
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
