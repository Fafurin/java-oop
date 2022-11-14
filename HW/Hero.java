package HW;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Hero implements Actions {

//    private static final int size = 10;
//
//    private static Integer [][] arena;
    private int x;

    private int y;

    protected int attack;
    protected int protection;
    protected int arrows;
    protected int[] damage;
    protected float health;

    protected float maxHealth;
    protected int speed;
    protected boolean delivery;
    protected boolean magic;
    protected String name;

    protected List<Hero> allies;

    protected List<Hero> enemies;

    protected void setAllies(List<Hero> allies) {
        this.allies = allies;
    }

    protected void setEnemies(List<Hero> enemies) {
        this.enemies = enemies;
    }

    public int getArrows() {
        return arrows;
    }

    public int setArrows(int arrows) {
        if (arrows < 0) return -1;
        if (arrows > 32) return -2;
        this.arrows = arrows;
        return arrows;
    }

    public Hero(
            String name,
            int attack,
            int protection,
            int arrows,
            int[] damage,
            float health,
            int speed,
            boolean delivery,
            boolean magic,
            int x,
            int y
    ) {
        this.name = name;
        this.attack = attack;
        this.protection = protection;
        this.arrows = arrows;
        this.damage = damage;
        this.health = this.maxHealth = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(
                "Name: " + name +
                        ". Attack: " + attack +
                        ". Protection: " + protection +
                        ". Arrows: " + arrows +
                        ". Damage: " + Arrays.toString(damage) +
                        ". Health: " + health +
                        ". Speed: " + speed +
                        ". Delivery: " + delivery +
                        ". Magic: " + magic +
                ". Coordinates: x: " + x + "; y: " + y);
    }

    public String getName() {
        return name;
    }

    public void step() {
        System.out.println(this.name + " has nothing to do.");
    }

    protected int approximateDamage() {
        if (this.damage.length == 1) return this.damage[0];
        else {
            int randomIndex = new Random().nextInt(this.damage.length);
            return this.damage[randomIndex];
        }
    }

//    public static void setArena() {
//        arena = new Integer [size][size];
//    }

//    public void setHeroOnDesk() {
//        setArena();
//        for (int i = 0; i < arena.length; i++) {
//            if (arena[0][i] == null) {
//                arena[0][i] = i;
//                this.x = 0;
//                this.y = i;
//            } else {
//                arena[size-1][i] = i;
//                this.x = size-1;
//                this.y = i;
//            }
//        }
//    }

}
