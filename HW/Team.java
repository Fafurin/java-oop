package HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {

    private static List<Hero> getTeam(int size) {
        List<Hero> party = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            switch (rnd.nextInt(7)) {
                case 0:
                    party.add(new Peasant());
                    break;
                case 1:
                    party.add(new Crossbowman());
                    break;
                case 2:
                    party.add(new Roque());
                    break;
                case 3:
                    party.add(new Sniper());
                    break;
                case 4:
                    party.add(new Monk());
                    break;
                case 5:
                    party.add(new Spearman());
                    break;
                default:
                    party.add(new Wizard());
                    break;
            }
        }
        return party;
    }

    public static void getTeamInfo(String name, int size) {
        System.out.println("The team " + name + " consists of " + size + " heroes:");
        getTeam(size).forEach(Hero::print);
    }

}
