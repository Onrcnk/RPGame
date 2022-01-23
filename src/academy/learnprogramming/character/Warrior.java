package academy.learnprogramming.character;

import academy.learnprogramming.character.skill.WarriorSpecialAttackOne;
import academy.learnprogramming.character.skill.WarriorSpecialAttackTwo;
import academy.learnprogramming.item.*;

import java.util.Scanner;

public class Warrior extends BaseCharacter{

    public Warrior() {
        this.baseHp = 900;
        this.baseAttack = 50;
        this.baseCriticalChance = 3;
        this.baseBlockChance = 4;
        this.baseDodgeChance = 5;
        this.hp = 900;
        this.attack = 50;
        this.criticalChance = 3;
        this.blockChance = 4;
        this.dodgeChance = 5;
        this.skillOne = new WarriorSpecialAttackOne();
        this.skillTwo = new WarriorSpecialAttackTwo();
    }

    public void firstWeaponChose(BaseCharacter character) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************************************");
        System.out.println("Which one do you choose?" + System.lineSeparator() +
                "(1) Knight's Sword: Increase Attack" + System.lineSeparator() +
                "(2) Sword of Virgin: Increase Critical Chance");
        System.out.println("*******************************************************");
        boolean validTwo = true;
        while (validTwo) {
            int secondChooseOne = scanner.nextInt();
            System.out.println("");
            switch (secondChooseOne) {
                case 1:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the Knight's Sword." + System.lineSeparator() +
                            "After your hesitation has passed, you take the sword in your hand and take a look." + System.lineSeparator() +
                            "The sword is quite sharp and eye-catching." + System.lineSeparator() +
                            "You seem pretty happy with your decisions.");
                    KnightsSword knightsSword = new KnightsSword();
                    knightsSword.setAttack(30);
                    character.equipWeapon(knightsSword);
                    validTwo = false;
                    break;
                case 2:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the Sword of Virgin." + System.lineSeparator() +
                            "After your hesitation has passed, you take the sword in your hand and take a look." + System.lineSeparator() +
                            "The sword is quite light and durable." + System.lineSeparator() +
                            "You seem pretty happy with your decisions.");
                    SwordOfVirgin swordOfVirgin = new SwordOfVirgin();
                    swordOfVirgin.setCriticalChance(2);
                    character.equipWeapon(swordOfVirgin);
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
                "(1) Knight's Sword: Increase Attack" + System.lineSeparator() +
                "(2) Sword of Virgin: Increase Critical Chance");
        System.out.println("*******************************************************");
        boolean validTwo = true;
        while(validTwo) {
            int secondChooseTwo = scanner.nextInt();
            System.out.println("");
            switch (secondChooseTwo) {
                case 1:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the Knight's Sword." + System.lineSeparator() +
                            "After your hesitation has passed, you take the sword in your hand and take a look." + System.lineSeparator() +
                            "The sword is quite rusty and unpretentious." + System.lineSeparator() +
                            "You seem pretty dissatisfied with your decisions.");
                    KnightsSword knightsSword = new KnightsSword();
                    character.equipWeapon(knightsSword);
                    validTwo = false;
                    break;
                case 2:
                    System.out.println(System.lineSeparator() +
                            "While your mind goes back and forth between the two weapons, your gaze remains locked on the Sword of Virgin." + System.lineSeparator() +
                            "After your hesitation has passed, you take the sword in your hand and take a look." + System.lineSeparator() +
                            "The sword is quite rusty and unpretentious." + System.lineSeparator() +
                            "You seem pretty dissatisfied with your decisions.");
                    SwordOfVirgin swordOfVirgin = new SwordOfVirgin();
                    character.equipWeapon(swordOfVirgin);
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
                "(1) King's Sword: Increase Attack" + System.lineSeparator() +
                "(2) Sword of Queen: Increase Block and Critical Chance");
        System.out.println("*******************************************************");
        boolean valid = true;
        while (valid) {
            int choose = scanner.nextInt();
            System.out.println("");
            switch (choose) {
                case 1:
                    System.out.println("You chose the King's Sword.");
                    KingsSword kingsSword = new KingsSword();
                    character.equipWeapon(kingsSword);
                    valid = false;
                    break;
                case 2:
                    System.out.println("You chose the Sword of Queen.");
                    SwordOfQueen swordOfQueen = new SwordOfQueen();
                    character.equipWeapon(swordOfQueen);
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
        System.out.println("");
        System.out.println("You suddenly see a chest appearing when a little after you get away from the devil and you hesitantly open it.");
        scanner.nextLine();
        System.out.println("Inside the chest you see two more different weapons.");
        scanner.nextLine();
        System.out.println("*******************************************************");
        System.out.println("Which one do you choose?" + System.lineSeparator() +
                "(1) God's Sword: Increase Attack and Critical Chance" + System.lineSeparator() +
                "(2) Sword of Goddess: Increase Attack, Critical and Block Chance");
        System.out.println("*******************************************************");
        boolean valid = true;
        while (valid) {
            int choose = scanner.nextInt();
            System.out.println("");
            switch (choose) {
                case 1:
                    System.out.println("You chose the God's Sword.");
                    GodsSword godsSword = new GodsSword();
                    character.equipWeapon(godsSword);
                    valid = false;
                    break;
                case 2:
                    System.out.println("You chose the Sword of Goddess.");
                    SwordOfGoddess swordOfGoddess = new SwordOfGoddess();
                    character.equipWeapon(swordOfGoddess);
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
