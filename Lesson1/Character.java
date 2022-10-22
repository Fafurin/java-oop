package Lesson1;

import java.util.Arrays;

public abstract class Character {
    protected int attack;
    protected int protection;
    protected int arrows;
    protected int[] damage;
    protected float health;
    protected int speed;
    protected boolean delivery;
    protected boolean magic;
    protected String name;

    public int getArrows() {
        return arrows;
    }

    public int setArrows(int arrows) {
        if (arrows < 0) return -1;
        if (arrows > 32) return -2;
        this.arrows = arrows;
        return arrows;
    }

    public Character(
        int attack,
        int protection,
        int arrows,
        int[] damage,
        float health,
        int speed,
        boolean delivery,
        boolean magic,
        String name
    ) {
        this.attack = attack;
        this.protection = protection;
        this.arrows = arrows;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = name;
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
            ". Magic: " + magic);
    }
}
