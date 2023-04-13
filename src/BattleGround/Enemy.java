package BattleGround;

import java.util.Random;

public abstract class Enemy implements Mortal{

    Random random = new Random();
    private int damage;
    private int health;
    private int name;

    public abstract void passiveSkill();
    public void counterAttack(Hero hero){
        System.out.println("Monster is attack and give " + this.damage + " damage");

        if(hero.getClass() == Archer.class){
            if(random.nextBoolean())
                hero.setHealth(hero.getHealth() - damage);
            else
                System.out.println("Its Archer, and hi is dodge -_-' ");
        }else
        hero.setHealth(hero.getHealth() - damage);
    }

    public void takeDamage(int damage){
        health = health - damage;
    }
    public Enemy(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
