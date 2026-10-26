package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public final class Klefki extends Pokemon {
    public Klefki(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FAIRY);
        setStats(57, 80, 91, 80, 87, 75);
        setMove(new Swagger(), new DoubleTeam(), new CalmMind(), new PlayRough());
    }
}
