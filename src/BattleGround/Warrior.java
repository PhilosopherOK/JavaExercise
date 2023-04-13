package BattleGround;

public class Warrior extends Hero{
    public Warrior(String name , int damage, int health) {
        super(name, damage, health);
    }


    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(this.getDamage());
        System.out.println("Hero Warrior " + super.getName() + " attack enemy and take him " + this.getDamage() + " damage (-)_(-)");
    }
    @Override
    public void skill(){
        if(random.nextBoolean()){
            this.setHealth(getHealth()+30);
            System.out.println("I am healthier and have "+ this.getHealth());
        }

        if(this.getHealth() <= 40){
            this.setDamage(40);
        }else{
            this.setDamage(10);
        }
    }
}
