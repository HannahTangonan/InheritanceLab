public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(){
        System.out.println("\nLet the battle Begin!");
    }

    Character(String name){
        characterName = name;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void charInitialize(){
        System.out.println("Character Initialized: " + characterName);
    }
    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints, Character ownCharacter, int manaCost){
        /**
         * Deduct health points from enemy character
         */

        enemyCharacter.healthPoints -= damagePoints;
        ownCharacter.manaPoints -= manaCost;

        if(enemyCharacter.healthPoints == 0){
            System.out.println(ownCharacter.characterName + " won the Battle!");
        }

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
    }

    public void healTarget(Character ownCharacter,int healPoints, int manaPoints){
        ownCharacter.healthPoints += healPoints;
        ownCharacter.manaPoints += manaPoints;

    }

    public void displayStats(){
        System.out.println(characterName + " Stats");
        System.out.println("Current Lvl: " + level);
        System.out.println("Current HP: " + healthPoints);
        System.out.println("Current MP: " + manaPoints);
    }

    public void increaseLvl(){
        System.out.println("\n" + characterName + " gained EXP for winning.");
        System.out.println(characterName + " leveled up.");
        level += 10;
    }


}