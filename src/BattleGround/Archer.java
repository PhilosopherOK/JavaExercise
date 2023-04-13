package BattleGround;

public class Archer extends Hero{
    public Archer(String name, int damage, int health) {
        super(name, damage, health);
    }


    @Override
    public void skill() {
        System.out.println("Archer have a chance for dodge");
    }

    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(this.getDamage());
        System.out.println("Hero Archer " + super.getName() + " attack enemy and take him " + getDamage() + " damage (SO)_(SO)");
    }
}
