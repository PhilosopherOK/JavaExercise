package BattleGround;

import java.util.Random;

public abstract class Hero implements Mortal {
    Random random = new Random();
    private String name;

    private int damage;

    private int health;

    public abstract void skill();

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);


    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

}
