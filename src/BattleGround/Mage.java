package BattleGround;

public class Mage extends Hero {

    public Mage(String name, int damage, int health) {
        super(name, damage, health);
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(this.getDamage());
        System.out.println("Hero Mage " + super.getName() + " attack enemy and take him " + getDamage() + " damage (OMG!)_(OMG!) ");
    }

    @Override
    public void skill() {
        setDamage(20);
        if (random.nextBoolean()) {
            setDamage(getDamage() * 2);
        }
    }

}
