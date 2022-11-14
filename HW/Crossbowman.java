package HW;

public class Crossbowman extends Hero {

    public Crossbowman(int x, int y) {
        super("Crossbowman", 6, 3, 16, new int[]{2, 3}, 10, 4, false, false, x, y);
    }

    @Override
    public void step() {
        boolean flag = true;
        int cnt = 0;
        while (flag) {
            if (enemies.get(cnt).health > 0) {
                enemies.get(cnt).health -= this.approximateDamage();
                if (enemies.get(cnt).health < 0 || enemies.get(cnt).health == 0) {
                    flag = false;
                    System.out.println(enemies.get(cnt).getName() + " is killed!");
                    cnt = 0;
                }
            }
            if (++cnt == enemies.size()) {
                flag = false;
                System.out.println("No one to kill.");
            }
        }
    }

}
