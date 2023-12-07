public class Hero {
    // damage 1-6 pts
    // health 10-20 pts
    // dex 3-8 pts

    public int damage;
    public int health;
    public int dex;

    public Hero(int damage, int health, int dex) {

        // int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        damage = (int)Math.floor(Math.random()*(6-1+1)+1);
        health = (int)Math.floor(Math.random()*(20-10+1)+10);
        dex = (int)Math.floor(Math.random()*(8-3+1)+3);

        System.out.println("Damage: "+ damage);
        System.out.println("Health: "+ health);
        System.out.println("Dexterity: "+ dex);

        if(damage >= 3) {
            System.out.println("Wow, you're strong!");            
        }

    }

    public int HeroAttack() {
        // default: as much damage as the hero's damage stat
        // if enemy defending: deal half as much damage
        return (damage*-1);
    }

    public void heal() {
        
    }

    // public int HeroDodge() {
    //     // if dodge, then evade attack with 1/10 


    // }

    // public HeroRun() {
    //     // return to block they were at
    // }

}