public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    public void fatalBonds(Character enemyCharacter, Character ownCharacter) {
        System.out.println("\n" +  super.characterName + " attacks " + enemyCharacter.characterName + " with Fatal Bonds (Damage - 50)");
        int damagePoints = 50;
        int manaCost = 60;
        damageTarget(enemyCharacter, damagePoints, ownCharacter, manaCost);
    }

    ;

    public void healingWard(Character ownCharacter) {
        System.out.println("\n" + super.characterName + " heals itself with healingWard (Health Points and Mana Points + 25)");
        int healPoints = 25;
        int manaPoints = 25;
        healTarget(ownCharacter, healPoints, manaPoints);


    }
}
