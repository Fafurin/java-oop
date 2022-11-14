package HW;

import java.util.ArrayList;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {

        List<Hero> allies = new ArrayList<>();
        List<Hero> enemies = new ArrayList<>();

        Team.getTeam("Black", allies, enemies, 0);
        Team.getTeam("White", allies, enemies, 9);

    }
}
