public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void fireStorm(Character enemyCharacter, Character ownCharacter) {
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
        int damagePoints = 50;
        int manaCost= 60;
        damageTarget(enemyCharacter, damagePoints, ownCharacter, manaCost);
    }

    ;

    public void refresh(Character ownCharacter) {
        System.out.println("\n" + super.characterName + " heals itself with refresh (Health Points and Mana Points + 25)");
        int healPoints = 25;
        int manaPoints = 25;
        healTarget(ownCharacter, healPoints, manaPoints);

    }
}
