package HW;

import java.util.List;

public class Wizard extends Hero {

    public Wizard(List<Hero> allies, int x, int y) {
        super("Wizard", 17, 12, 0, new int[]{-5}, 30, 9, false, true, x, y);
        super.setAllies(allies);
    }

    private int strike() {
        return this.attack;
    }

    @Override
    public void step() {
        boolean flag = true;
        int cnt = 0;
        while (flag) {
            if (allies.get(cnt).health < allies.get(cnt).maxHealth) {
                allies.get(cnt).health -= this.approximateDamage();
                if (allies.get(cnt).health > allies.get(cnt).maxHealth) allies.get(cnt).health = allies.get(cnt).maxHealth;
                flag = false;
                System.out.println(allies.get(cnt).getName() + " is cured!");
                cnt = 0;
            }
            if (++cnt == allies.size()) {
                flag = false;
                System.out.println("No one to cure.");
            }
        }
    }

}