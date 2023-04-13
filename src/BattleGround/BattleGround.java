package BattleGround;

public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy1 = new Zombie(100, 10);
        Enemy enemy2 = new Zombie(125, 20);
        Enemy enemy3 = new Zombie(150, 30);
        Hero hero1 = new Warrior("Sir.Gerold", 10, 150);
        Hero hero2 = new Archer("ArrowMan", 15, 125);
        Hero hero3 = new Mage("ArchiSorcer", 20, 100);

        System.out.println();
        fight(enemy3, hero1);

    }

    public static void fight(Enemy enemy, Hero hero){
        while(enemy.isAlive(enemy) && hero.isAlive(hero)){
            System.out.println(hero.getHealth() + " health hero and " + enemy.getHealth() + " health enemy");
            hero.skill();
            enemy.passiveSkill();
            hero.attackEnemy(enemy);
            enemy.counterAttack(hero);
            System.out.println();
        }
        System.out.println("Results of the battle: ");
        enemy.isAlive(enemy);
        hero.isAlive(hero);
    }
}
