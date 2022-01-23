package academy.learnprogramming.story;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.boss.BossTwo;
import academy.learnprogramming.character.Assassin;
import academy.learnprogramming.character.BaseCharacter;
import academy.learnprogramming.character.Tank;
import academy.learnprogramming.character.Warrior;

import java.util.Scanner;


public class StoryHelper {


    public void storyIntro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mephistopheles: ... " );
        scanner.nextLine();
        System.out.println("God: ..." );
        scanner.nextLine();
        System.out.println("Mephistopheles: Father of the blessed, then let me show you if I am right.");
        scanner.nextLine();
        System.out.println("At the end of all this you will see that what I am seeking is not rebellion but absolute purpose.");
        scanner.nextLine();
        System.out.println("God: ...");
        scanner.nextLine();
        System.out.println("Mephistopheles: God's words are a blessing for some and an eternal torment for others.");
        scanner.nextLine();
        System.out.println("Because your silence still possesses this son of yours who has been labeled a sinner.");
        scanner.nextLine();
        System.out.println("But still, let me.");
        scanner.nextLine();
        System.out.println("Whether it's the most precious or the most hurtful, just give me one so I can show you what I mean.");
        scanner.nextLine();
        System.out.println("God: ...");
        scanner.nextLine();
        System.out.println("Mephistopheles: I count your approval as my blessing...");
        scanner.nextLine();
        System.out.println("God: ...");
    }

    public BaseCharacter storyFirstEvent(BaseCharacter character) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("And even though you have no idea where you are, you love to live and you think you need to act as soon as possible to survive.");
        scanner.nextLine();
        System.out.println("You stand up and shake off the mud and sand while you look around.");
        scanner.nextLine();
        System.out.println("You are obviously on a desert island.");
        scanner.nextLine();
        System.out.println("A few meters ahead, you see a path stretching through the trees.");
        scanner.nextLine();
        System.out.println("You sure you have to follow this path.");
        scanner.nextLine();
        System.out.println("On the other hand, the area outside the path is quite wide.");
        scanner.nextLine();
        System.out.println("Also, when you look beyond the sea, you see a storm approaching towards you.");
        scanner.nextLine();
        System.out.println("If you want to explore the beach, you may not have much time for that.");
        scanner.nextLine();
        System.out.println("*******************************************************" + System.lineSeparator() +
                "What you want to do?" + System.lineSeparator() +
                "(1) Explore the beach"  + System.lineSeparator() +
                "(2) Go straight to the path" + System.lineSeparator() +
                "*******************************************************");
        boolean validOne = true;
        while (validOne) {
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(" ");
                    System.out.println("You took the risk and decided to explore the surroundings.");
                    System.out.println(" ");
                    scanner.nextLine();
                    System.out.println("Shortly after you start exploring, you see a chest hidden behind a pile of rocks and you open it rapidly.");
                    scanner.nextLine();
                    System.out.println("There are two different weapons.");
                    System.out.println(" ");
                    character.firstWeaponChose(character);
                    System.out.println("");
                    System.out.println("After you choose your weapon, the other one slowly starts to fade and disappear.");
                    scanner.nextLine();
                    System.out.println("Was this also God's test?");
                    scanner.nextLine();
                    System.out.println("Whatever, there is no time think a lot.");
                    scanner.nextLine();
                    System.out.println("After wandering around for a while, you come back and continue down the path without finding anything else.");
                    validOne = false;
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("You don't want to take risks and you're heading straight for the path.");
                    scanner.nextLine();
                    System.out.println("Right at the entrance of the path, you see a chest hidden behind the rocks and you open it.");
                    scanner.nextLine();
                    System.out.println("There are two different weapons.");
                    System.out.println(" ");
                    character.firstWeaponChoseAlternative(character);
                    scanner.nextLine();
                    System.out.println("");
                    System.out.println("After you choose your weapon, the other one slowly starts to fade and disappear.");
                    scanner.nextLine();
                    System.out.println("Was this also God's test?");
                    scanner.nextLine();
                    System.out.println("Whatever, there is no time think a lot.");
                    scanner.nextLine();
                    System.out.println("After wandering around for a while, you come back and continue down the path without finding anything else.");
                    validOne = false;
                    break;
                default:
                    System.out.println("Choose 1 or 2, idiot.");
                    break;
            }
        }
        return character;
    }

    public BaseBoss storySecondEvent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("You pull yourself together and hit the road again.");
        scanner.nextLine();
        System.out.println("After walking for an hour, you come across a mountain and you see that the path leads towards the top of this mountain.");
        scanner.nextLine();
        System.out.println("Just as you are about to continue on the path, you has a bad feeling.");
        scanner.nextLine();
        System.out.println("Thinking about the demon you've only recently faced, you think the path might not be very safe.");
        scanner.nextLine();
        System.out.println("Maybe it would be better to climb the mountain directly instead of walking on the path whenever possible.");
        scanner.nextLine();
        System.out.println("The storm is coming, now you have to make a decision.");
        scanner.nextLine();
        System.out.println("*******************************************");
        System.out.println("What will you do?");
        System.out.println("(1) Continue on the path");
        System.out.println("(2) Keep climbing as much as possible");
        System.out.println("*******************************************");
        BossTwo bossTwo = new BossTwo();
        boolean valid = true;
        System.out.println("");
        while(valid){
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.print("As you try to decide what to do, you wake up with a flash of the sky.");
                    System.out.println("");
                    scanner.nextLine();
                    System.out.print("The storm is almost on the island, there's no more time to lose.");
                    scanner.nextLine();
                    System.out.print("Without wasting any more time, you enter the path and start running towards the summit.");
                    scanner.nextLine();
                    System.out.print("After a while, you start to complain about your hasty attitude.");
                    scanner.nextLine();
                    System.out.print("Because at that very moment, you see that the demon running down from the summit towards you is even bigger than the previous one.");
                    System.out.println("");
                    scanner.nextLine();
                    valid = false;
                    break;
                case 2:
                    System.out.print("Your last fight was very tough.");
                    scanner.nextLine();
                    System.out.print("Even if you survived a similar fight, you think you could be caught in a storm by being exhausted.");
                    scanner.nextLine();
                    System.out.print("It's good to be a little cautious");
                    scanner.nextLine();
                    System.out.print("You start climbing by choosing the best place to start.");
                    scanner.nextLine();
                    System.out.print("After climbing as much as possible, you come to a flat.");
                    scanner.nextLine();
                    System.out.print("All of a sudden, the ground begins to shake and you start to hear thunderous rumblings.");
                    scanner.nextLine();
                    System.out.print("Someone, presumably a new demon, is speeding towards you.");
                    scanner.nextLine();
                    System.out.print("As you look around to escape, you see a sword too big for you to carry, leaning against the rock at the edge of the cliff.");
                    scanner.nextLine();
                    System.out.print("Thinking that there is no possibility of escaping from this demon that is rapidly approaching you, you push the sword down the cliff with a sudden movement.");
                    scanner.nextLine();
                    System.out.print("Even though you couldn't escape this fight, at least you were able to reduce the enemy's attack power a bit.");
                    System.out.println("");
                    scanner.nextLine();
                    bossTwo.setAttack(50);
                    valid = false;
                    break;
                default:
                    System.out.println("Choose 1 or 2, idiot.");
                    break;
            }
        }
        return bossTwo;
    }

    public void storyThirdEvent() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("You are alive.");
        scanner.nextLine();
        System.out.println("You kill three demons and still alive.");
        scanner.nextLine();
        System.out.println("But there is something.");
        scanner.nextLine();
        System.out.println("You realize that the path which you follow is finish.");
        scanner.nextLine();
        System.out.println("You are now on the edge of a cliff.");
        scanner.nextLine();
        System.out.println("You also suddenly realize last words of demon which you slay for a while ago.");
        scanner.nextLine();
        System.out.println("'Only true believers can pass this trial.'");
        scanner.nextLine();
        System.out.println("'Even though you are resourceful enough to spill your blood, do you have the courage to take the next step?'");
        scanner.nextLine();
        System.out.println("Take the next step?");
        scanner.nextLine();
        System.out.println("Does all this mean a leap of fate?");
        scanner.nextLine();
        System.out.println("God, faith and demons...");
        scanner.nextLine();
        System.out.println("Considering what you've been through in the last few hours, it makes perfect sense for this whole adventure to end with a leap of faith.");
        scanner.nextLine();
        System.out.println("So what if you're wrong?");
        scanner.nextLine();
        System.out.println("How right would it be to throw yourself off a cliff after all that struggle?");
        scanner.nextLine();
        System.out.println("Perhaps you misinterpreted what the demon said, perhaps you need to discover another way off the path to get off this island.");
        scanner.nextLine();
        System.out.println("But the storm is about to arrive on the island.");
        scanner.nextLine();
        System.out.println("");
        System.out.println("What will you do?");
        System.out.println("*****************************************************************************");
        System.out.println("In the name of God's blessing, there is no faith without hesitation, but still it is necessary to go on the path of faith." + System.lineSeparator() + "(1) Stop thinking and jump off the cliff");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Faith is the foundation of religion, but mind was not given to man as a weight." + System.lineSeparator() + "(2) Go back and find another way to escape the island before it's too late");
        System.out.println("*****************************************************************************");
        boolean valid = true;
        while (valid) {
                int choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("After you made your decision, you jumped off the cliff without a second thought.");
                        scanner.nextLine();
                        System.out.println("");
                        System.out.println("And just seconds later you crashed into the cliffs below the slope and die.");
                        System.out.println("****************************************************************************************");
                        scanner.nextLine();
                        System.out.println("Mephistopheles: ... ");
                        scanner.nextLine();
                        System.out.println("God: ...");
                        scanner.nextLine();
                        System.out.println("Mephistopheles: That's what I was telling you about.");
                        scanner.nextLine();
                        System.out.println("The belief you created to keep them in order is just bigotry to them.");
                        scanner.nextLine();
                        System.out.println("All I want is for the humanity you commanded to exist to reach a level worthy of you.");
                        scanner.nextLine();
                        System.out.println("My teachings and all my sins are for them.");
                        scanner.nextLine();
                        System.out.println("I am sure that humanity's true potential will be revealed only when they are in a position to make their own decisions and take their own responsibilities." + "\u001B[0m");
                        scanner.nextLine();
                        System.out.println("God: ...");
                        scanner.nextLine();
                        System.out.println("Mephistopheles: ...");
                        scanner.nextLine();
                        System.out.println("God: ....");
                        scanner.nextLine();
                        System.out.println("Mephistopheles: So all you want from me is not to interfere in your things and to guard your hell.");
                        scanner.nextLine();
                        System.out.println("Well then, whatever you want, I'll throw a feast in your hell for my new visitor...");
                        scanner.nextLine();
                        valid = false;
                        break;
                    case 2:
                        System.out.println("After you make your decision, you start running down the path quickly.");
                        scanner.nextLine();
                        System.out.println("When you get back to the beach, you climb the tallest tree you can find and look around.");
                        scanner.nextLine();
                        System.out.println("After climbing to the top of the tree, you see a boat on the far side of the beach.");
                        scanner.nextLine();
                        System.out.println("But now it's too late, before you get down, a lightning bolt from the approaching storm hits the tree.");
                        scanner.nextLine();
                        System.out.println("Guess what?");
                        scanner.nextLine();
                        System.out.println("You die.");
                        System.out.println("****************************************************************************************");
                        scanner.nextLine();
                        System.out.println("Mephistopheles: ... ");
                        scanner.nextLine();
                        System.out.println("God: ...");
                        scanner.nextLine();
                        System.out.println("Mephistopheles: That's what I was telling you about.");
                        scanner.nextLine();
                        System.out.println("The humanity you created from nothing wants to live, not belief.");
                        scanner.nextLine();
                        System.out.println("Even though I showed them the demons of hell and spoke to them on your behalf, they still doubted the faith.");
                        scanner.nextLine();
                        System.out.println("All I want is for the humanity you commanded to exist to reach a level worthy of you.");
                        scanner.nextLine();
                        System.out.println("My teachings and all my sins are for them.");
                        scanner.nextLine();
                        System.out.println("I am sure that humanity's true potential will be revealed only when they are in a position to make their own decisions and take their own responsibilities.");
                        scanner.nextLine();
                        System.out.println("God: ...");
                        scanner.nextLine();
                        System.out.println("Mephistopheles: ...");
                        scanner.nextLine();
                        System.out.println("God: ....");
                        scanner.nextLine();
                        System.out.println("Mephistopheles: So all you want from me is not to interfere in your things and to guard your hell.");
                        scanner.nextLine();
                        System.out.println("Well then, whatever you want, I'll throw a feast in your hell for my new visitor...");
                        scanner.nextLine();
                        valid = false;
                        break;
                    default:
                        System.out.println("\u001B[32m" + "The moment of final decision has come, choose (1) or (2)" + "\u001B[0m");
                        break;
                }
        }
        System.out.println("------------------");
        scanner.nextLine();
        System.out.println("Never forget, you are only a toy in the hands of those in power.");
        scanner.nextLine();
        System.out.println("Someone bless you!");
        scanner.nextLine();
        System.out.println("------FINITO------");
    }

    public void campEvents(BaseCharacter character) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("After you calm down a bit, you realize what you're going through.");
        scanner.nextLine();
        System.out.println("You managed to get rid of the devil.");
        scanner.nextLine();
        System.out.println("But you also took a lot of damage.");
        scanner.nextLine();
        System.out.println("You need some rest.");
        scanner.nextLine();
        System.out.println("You start to wander around and soon you find a suitable place to rest.");
        scanner.nextLine();
        System.out.println("*******************************************************");
        System.out.println("What will you do now?");
        System.out.println("(1) Short rest : " + "No risk, no totally gain");
        System.out.println("(2) Long rest :" + "You may have a good nap or a new wound");
        System.out.println("*******************************************************");
        int hp;
        boolean valid = true;
        while (valid) {
            int choose = scanner.nextInt();
            System.out.println("");
            switch (choose) {
                case 1:
                    hp = 300;
                    character.setHp(character.getHp() + hp);
                    scanner.nextLine();
                    System.out.print("You lie on the floor and start thinking about others, is there anyone who will miss you?");
                    scanner.nextLine();
                    System.out.print("Your family, your partner or your friends.Are you sure they will always miss you?");
                    scanner.nextLine();
                    System.out.print("What a pitiful question, whatever you have gained " + hp + " health points.");
                    valid = false;
                    break;
                case 2:
                    int eventNumber = (int) Math.floor(Math.random() * 10);
                    switch (eventNumber) {
                        case 1:
                            character.setHp(500);
                            scanner.nextLine();
                            System.out.print("You lie on the floor and shut down your eyes.");
                            scanner.nextLine();
                            System.out.print("Your huge part of health point is recovered.");
                            valid = false;
                            break;
                        case 2:
                        case 7:
                            hp = 200;
                            character.setHp(character.getHp() + (hp * 3));
                            scanner.nextLine();
                            System.out.print("You lie on the floor and shut down your eyes.");
                            scanner.nextLine();
                            System.out.print("But you woke up when heard wolves howling.");
                            scanner.nextLine();
                            System.out.print("No more comfort for you.");
                            scanner.nextLine();
                            System.out.print("You have gained " + hp + " health points.");
                            valid = false;
                            break;
                        case 3:
                        case 8:
                            hp = 300;
                            character.setHp(character.getHp() + hp);
                            scanner.nextLine();
                            System.out.print("You lie on the floor and shut down your eyes.");
                            scanner.nextLine();
                            System.out.print("Because of the blood you've spilled and the flesh you've cut, you're just taking a nap.");
                            scanner.nextLine();
                            System.out.print("You have gained " + hp + " health points.");
                            valid = false;
                            break;
                        case 4:
                        case 9:
                            hp = 100;
                            character.setHp(character.getHp() + hp);
                            scanner.nextLine();
                            System.out.print("You lie on the floor and shut down your eyes.");
                            scanner.nextLine();
                            System.out.print("But you can't sleep because of the taste of blood in your mouth.");
                            scanner.nextLine();
                            System.out.print("What a dreadful glory you have.");
                            scanner.nextLine();
                            System.out.print("You have gained " + hp + " health points.");
                            valid = false;
                            break;
                        case 5:
                            scanner.nextLine();
                            System.out.print("You lie on the floor and shut down your eyes.");
                            scanner.nextLine();
                            System.out.print("What is that sound?");
                            scanner.nextLine();
                            System.out.print("Howling wolves... You know, they can follow the scent of blood that covers you.");
                            scanner.nextLine();
                            System.out.print("There is neither sleep nor nap, you have to run away.");
                            valid = false;
                            break;
                        case 6:
                            hp = 50;
                            character.setHp(character.getHp() - hp);
                            scanner.nextLine();
                            System.out.print("You lie on the floor and shut down your eyes.");
                            scanner.nextLine();
                            System.out.print("You woke up with a pain and look around. Wolves are attacking you.");
                            scanner.nextLine();
                            System.out.print("You threw yourself over the fire you made before bed and " + "/n" + "just as you grabbed one of the flaming branches that were falling apart, you started to run away.");
                            scanner.nextLine();
                            System.out.print("You have lost " + hp + " health points");
                            valid = false;
                            break;
                        default:
                            System.out.println("Chose 1 to 9, idiot");
                            break;
                    }
            }
        }
    }

    public void imaginaryVoiceEvent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("******************************************************************************************************************");
        scanner.nextLine();
        System.out.print("You are the chosen one by god.");
        scanner.nextLine();
        System.out.print("Get up and proceed on the obstacle course in front of you.");
        scanner.nextLine();
        System.out.print("You will atone for your life with the lives of the demons in your path to be in God's presence.");
        scanner.nextLine();
        System.out.print("Know that God loves most believers and devotees.");
        scanner.nextLine();
        System.out.print("Now, wake up and move on!");
        scanner.nextLine();
        System.out.println("******************************************************************************************************************");
        scanner.nextLine();
    }

    public BaseCharacter chooseClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You wake up with a splash of water on your face.");
        scanner.nextLine();
        System.out.println("Did all of that words are just a dream?");
        scanner.nextLine();
        System.out.println("You come back to yourself after a bit of stupefaction.");
        scanner.nextLine();
        System.out.println("When you turn your head where you lie down, you see that you are on the beach, but you have no idea how you got here.");
        scanner.nextLine();
        System.out.println("*******************************************************");
        System.out.println("Do you remember, who are you?");
        System.out.println("(1) Knight");
        System.out.println("(2) Assassin");
        System.out.println("(3) Warrior");
        System.out.println("*******************************************************");
        boolean valid = true;
        BaseCharacter character = new BaseCharacter() {
        };
        while (valid) {
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    character = chosenClassTank();
                    valid = false;
                    break;
                case 2:
                    character = chosenClassAssassin();
                    valid = false;
                    break;
                case 3:
                    character = chosenClassWarrior();
                    valid = false;
                    break;
                default:
                    scanner.nextLine();
                    System.out.print("You have to choose one of three.");
                    scanner.nextLine();
                    System.out.print("This game not too complex as you think.");
                    scanner.nextLine();
                    System.out.print("Make another choose");
                    break;
            }
        }
        return character;
    }

    public Tank chosenClassTank() {
        Scanner scanner = new Scanner(System.in);
        Tank character = new Tank();
        System.out.println("");
        System.out.println("Blood and honour, steel and pride.");
        scanner.nextLine();
        System.out.println("You are one of the commander of the only king who rules nine continents.");
        return character;
    }

    public Assassin chosenClassAssassin() {
        Scanner scanner = new Scanner(System.in);
        Assassin character = new Assassin();
        System.out.println("");
        System.out.println("Darkness,shadow and blood.");
        scanner.nextLine();
        System.out.println("You are the murderer of the men who tried to change the order.");
        return character;
    }

    public Warrior chosenClassWarrior() {
        Scanner scanner = new Scanner(System.in);
        Warrior character = new Warrior();
        System.out.println("");
        System.out.println("Money, ostracism and anger.");
        scanner.nextLine();
        System.out.println("You are the sword wielder who kill for money and living for their loved ones.");
        return character;
    }

}

