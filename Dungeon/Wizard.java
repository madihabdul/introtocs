public class Wizard {

    // damage 4-8 points
    // health 12-24 points

    public int wizardHealth;
    public int wizardDamage;
    
    public Wizard(int wizardHealth, int wizardDamage) {

        // int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        wizardDamage = (int)Math.floor(Math.random()*(8-4+1)+4);
        wizardHealth = (int)Math.floor(Math.random()*(24-12+1)+12);

        System.out.println("Wizard Damage: "+ wizardDamage);
        System.out.println("Wizard Health: "+ wizardHealth);
    }

    // public WizardAttack() {

    // }
    
}
