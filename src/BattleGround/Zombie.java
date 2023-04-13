package BattleGround;

import java.util.Random;

public class Zombie extends Enemy{
    Random random = new Random();
    public Zombie(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void passiveSkill(){
        if(this.getHealth() <= 0){
            if(random.nextBoolean()){
                setHealth(100);
                System.out.println("I am Ressurected !");
            }
        }

    }


    @Override
    public boolean isAlive(Enemy enemy) {
        return super.isAlive(enemy);
    }
}
