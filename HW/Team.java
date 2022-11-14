package HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {

    public static void getTeam(String name, List<Hero> allies, List<Hero> enemies, int x) {
        List<Hero> team = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            switch (rnd.nextInt(7)) {
                case 0:
                    team.add(new Peasant(x, i));
                    break;
                case 1:
                    team.add(new Crossbowman(x, i));
                    break;
                case 2:
                    team.add(new Roque(x, i));
                    break;
                case 3:
                    team.add(new Sniper(x, i));
                    break;
                case 4:
                    team.add(new Monk(x, i));
                    break;
                case 5:
                    team.add(new Spearman(x, i));
                    break;
                default:
                    team.add(new Wizard(allies, x, i));
                    break;
            }
        }
        System.out.println("The " + name + " team has the following heroes: ");
        team.forEach(Hero::print);
    }

}
