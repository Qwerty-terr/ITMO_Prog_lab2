package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Riolu extends Pokemon {
    public Riolu(String name, int level) {
        super(name, level);
        setType(Type.FIGHTING);
        setStats(40, 70, 40, 35, 40, 60);
        setMove(new WorkUp(), new DoubleTeam(), new Swagger());
    }
}
