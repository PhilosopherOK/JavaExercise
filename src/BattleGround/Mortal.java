package BattleGround;

public interface Mortal {

    default boolean isAlive(Enemy enemy) {
        if(enemy.getHealth() <= 0)
        System.out.println("Monster is die");
        return enemy.getHealth() > 0;
    }

    default boolean isAlive(Hero hero) {
        if(hero.getHealth() <= 0)
            System.out.println(hero.getName() + " is die");
        return hero.getHealth() > 0;
    }
}
