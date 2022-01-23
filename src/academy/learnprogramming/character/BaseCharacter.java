package academy.learnprogramming.character;

import academy.learnprogramming.character.skill.Skill;
import academy.learnprogramming.item.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public abstract class BaseCharacter{
    int baseHp;
    int baseAttack; //50
    int baseCriticalChance;
    int baseBlockChance;
    int baseDodgeChance;
    int hp;
    int attack; //70
    int criticalChance;
    int blockChance;
    int dodgeChance;
    int specialAttackOneCount = 0;
    Skill skillOne;
    Skill skillTwo;
    Item item;
    boolean escape = false;
    ArrayList<Item> items = new ArrayList<>();

    public void getItem(Item item){
        this.item = item;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    private void improveStats(HashMap<String, Integer> stats){
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            switch (entry.getKey()){
                case "hp" :
                    this.baseHp += entry.getValue();
                    this.hp += entry.getValue();
                    break;

                case "attack" :
                    this.baseAttack += entry.getValue();
                    this.attack += entry.getValue();
                    break;

                case "criticalChance" :
                    this.baseCriticalChance += entry.getValue();
                    this.criticalChance += entry.getValue();
                    break;

                case "blockChance" :
                    this.baseBlockChance += entry.getValue();
                    this.blockChance += entry.getValue();
                    break;

                case "dodgeChance" :
                    this.baseDodgeChance += entry.getValue();
                    this.dodgeChance += entry.getValue();
                    break;
            }
        }
    }

    private void decreaseStats(HashMap<String, Integer> stats){
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            switch (entry.getKey()){
                case "hp" :
                    this.baseHp -= entry.getValue();
                    this.hp -= entry.getValue();
                    break;

                case "attack" :
                    this.baseAttack -= entry.getValue();
                    this.attack -= entry.getValue();
                    break;

                case "criticalChance" :
                    this.baseCriticalChance -= entry.getValue();
                    this.criticalChance -= entry.getValue();
                    break;

                case "blockChance" :
                    this.baseBlockChance -= entry.getValue();
                    this.blockChance -= entry.getValue();
                    break;

                case "dodgeChance" :
                    this.baseDodgeChance -= entry.getValue();
                    this.dodgeChance -= entry.getValue();
                    break;
            }
        }
    }

    public void equipWeapon(Item item){
        improveStats(item.getStats());
        items.add(item);
        getItem(item);
    }

    public int getHpStatus(){
        return Math.max(getHp(), 0);
    }

    public void firstWeaponChose(BaseCharacter character){
    }

    public void firstWeaponChoseAlternative(BaseCharacter character){
    }

    public void secondWeaponChose(BaseCharacter character){
    }

    public void thirdWeaponChose(BaseCharacter character){
    }

}