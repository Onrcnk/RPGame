package academy.learnprogramming.fight;

import academy.learnprogramming.boss.BaseBoss;
import academy.learnprogramming.character.BaseCharacter;

import java.util.Scanner;

public abstract class Fight {
    static final int BASIC_ATTACK = 1;
    static final int SPECIAL_ATTACK_ONE = 2;
    static final int SPECIAL_ATTACK_TWO = 3;
    static final int SPECIAL_ATTACK_THREE = 4;
    static final int SECOND_PHASE_CONDITION = 400;
    static final int ESCAPE_ATTEMPTING = 5;
    int combatTurn = 0;
    int specialAttackTurn = 0;

    public abstract void startFight(BaseCharacter character, BaseBoss boss);
    public abstract void secondPhaseFight(BaseCharacter character, BaseBoss boss);
    public boolean checkFirstPhaseFightStatus(BaseCharacter character, BaseBoss boss) {
        return character.getHp() <= 0 || boss.getHp() <= SECOND_PHASE_CONDITION || character.isEscape();
    }
    public boolean checkSecondPhaseFightStatus(BaseCharacter character, BaseBoss boss) {
        return character.getHp() <= 0 || boss.getHp() <= 0 || character.isEscape();
    }
    public void printFinalFightResult(BaseCharacter character, BaseBoss boss) {
        if (boss.getHp() <= 0) {
            System.out.println("You Win");
        } else if (character.getHp() <= 0) {
            System.out.println("You Die!");
        }
    }
    public void endFight(BaseCharacter character){
        combatTurn = 0;
        specialAttackTurn = 0;
        character.getSkillOne().setSpecialAttackOneCount(0);
        character.getSkillTwo().setSpecialAttackOneCount(0);
        character.setEscape(false);
    }
    private void characterBasicAttack(BaseCharacter character, BaseBoss boss) {
        int hp;
        hp = boss.getHp() - character.getAttack();
        boss.setHp(hp);
        System.out.println("Demon Remain: " + boss.getHpStatus());
    }
    private void bossBasicAttack(BaseCharacter character, BaseBoss boss) {
        int hp;
        hp = character.getHp() - boss.getAttack();
        character.setHp(hp);
        System.out.println("Demon hit you. Character remain: " + character.getHpStatus());
    }
    public void attackTypeChoose(BaseCharacter character, BaseBoss boss) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your action :");
        System.out.println("(1) Basic attack");
        System.out.println("(2) Special attack One");
        System.out.println("(3) Special attack Two");
        System.out.println("(4) Item attack");
        System.out.println("(5) Escape");
        int choose = scanner.nextInt();
        System.out.println("");
        setSpecialAttackTurnCounter(character);
        switch (choose) {
            case BASIC_ATTACK:
                getBasicAttack(character, boss);
                break;
            case SPECIAL_ATTACK_ONE:
                getSpecialAttackOne(character, boss);
                break;
            case SPECIAL_ATTACK_TWO:
                specialAttackTurn = combatTurn;
                getSpecialAttackTwo(character, boss);
                break;
            case SPECIAL_ATTACK_THREE:
                getSpecialAttackThree(character, boss);
                break;
            case ESCAPE_ATTEMPTING:
                character.setEscape(true);
                break;
            default:
                wrongEntryReturn();
                break;
        }
        combatTurn++;
    }
    private void setSpecialAttackTurnCounter(BaseCharacter character){
        if(combatTurn - specialAttackTurn == 4){
            character.setAttack(character.getBaseAttack());
            character.setBlockChance(character.getBaseBlockChance());
            character.setCriticalChance(character.getBaseCriticalChance());
        }
    }
    private void getBasicAttack(BaseCharacter character, BaseBoss boss) {
        if (isCharacterAttackCritical(character, boss) && boss.getHp() >= 0) {
            System.out.println("You hit critical. Demon remain: " + boss.getHpStatus());
        } else {
            characterBasicAttack(character, boss);
        }
        if (isAttackSuccessful(character)) {
            if (isBossAttackCritical(character, boss) && character.getHp() >= 0) {
                System.out.println("Boss hit critical. Character remain: " + character.getHpStatus());
            } else {
                bossBasicAttack(character, boss);
            }
        }
    }
    private void getSpecialAttackOne(BaseCharacter character, BaseBoss boss) {
        boolean isSpecialAttackSuccessful = character.getSkillOne().cast(character, boss);
        if (isSpecialAttackSuccessful) {
            if (isBossAttackCritical(character, boss) && character.getHp() >= 0) {
                System.out.println("Boss hit critical. Character remain: " +  character.getHpStatus());
            } else {
                bossBasicAttack(character, boss);
            }
        }else{
            specialAttackTurn ++;
        }
    }
    private void getSpecialAttackTwo(BaseCharacter character, BaseBoss boss){
        boolean isSpecialAttackSuccessful = character.getSkillTwo().cast(character, boss);
        if (isSpecialAttackSuccessful) {
            if (isBossAttackCritical(character, boss) && character.getHp() >= 0) {
                System.out.println("Boss hit critical. Character remain: " + character.getHpStatus());
            }else {
                bossBasicAttack(character, boss);
            }
        }
    }
    private void getSpecialAttackThree(BaseCharacter character, BaseBoss boss) {
        boolean isSpecialAttackSuccessful = character.getItem().cast(character, boss, combatTurn);
        if (isSpecialAttackSuccessful) {
            if (isBossAttackCritical(character, boss) && character.getHp() >= 0) {
                System.out.println("Boss hit critical. Character remain: " + character.getHpStatus());
            } else {
                bossBasicAttack(character, boss);
            }
        }else{
            specialAttackTurn ++;
        }
    }
    private void wrongEntryReturn() {
        combatTurn--;
        System.out.println("Make another choose");
    }
    private boolean isCharacterAttackCritical(BaseCharacter character, BaseBoss boss) {
        if (character.getCriticalChance() + Math.floor(Math.random() * 10) > 10) {
            characterCriticalAttack(character, boss);
            return true;
        }
        return false;
    }
    private void characterCriticalAttack(BaseCharacter character, BaseBoss boss){
        int hp = boss.getHp() - (character.getAttack() * 2);
        boss.setHp(hp);
    }
    private void bossCriticalAttack(BaseCharacter character, BaseBoss boss){
        int hp = character.getHp() - (boss.getAttack() * 2);
        character.setHp(hp);
    }
    private boolean isBossAttackCritical(BaseCharacter character, BaseBoss boss) {
        if (boss.getCriticalChance() + Math.floor(Math.random() * 10) > 10) {
            bossCriticalAttack(character, boss);
            return true;
        }
        return false;
    }
    private boolean isAttackBlocked(BaseCharacter character) {
        return character.getBlockChance() + Math.floor(Math.random() * 10) > 14;
    }
    private boolean isAttackDodged(BaseCharacter character) {
        return character.getDodgeChance() + Math.floor(Math.random() * 10) > 10;
    }
    private boolean isAttackSuccessful(BaseCharacter character) {
        if (isAttackBlocked(character)) {
            System.out.println("You block the attack. Character remain: " + character.getHp());
            return false;
        } else if (isAttackDodged(character)) {
            System.out.println("You dodge the attack. Character remain: " + character.getHp());
            return false;
        } else {
            return true;
        }
    }
    public boolean letCharacterEscape(BaseCharacter character, BaseBoss boss){
        if(character.isEscape()) {
            bossCriticalAttack(character, boss);
            System.out.println("You attempt to escape, Boss hit your back. Character Remain = " + character.getHpStatus());
            if (character.getHpStatus() == 0) {
                System.out.println("");
                System.out.println("You Die");
                System.out.println("");
            }else {
                System.out.println("");
                System.out.println("You Escape");
                return true;
            }
        }
        return false;
    }
}