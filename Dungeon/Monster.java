public class Monster {

    // damage 1-4 points
    // health 5-10 points

    public int monsterHealth;
    public int monsterDamage;
    
    public Monster(int monsterHealth, int monsterDamage) {

        // int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        monsterDamage = (int)Math.floor(Math.random()*(4-1+1)+1);
        monsterHealth = (int)Math.floor(Math.random()*(10-5+1)+5);

        System.out.println("Monster Damage: "+ monsterDamage);
        System.out.println("Monster Health: "+ monsterHealth);
    }

    // public MonsterAttack(int damage) {
    //     // decrease attack
    // }

    // public MonsterDefend(int damage) {

    // }
    
}
