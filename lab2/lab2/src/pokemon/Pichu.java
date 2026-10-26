package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Pichu extends Pokemon {
    public Pichu(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(20, 40, 15, 35, 35, 60);
        setMove(new ThunderShock(), new Thunder());
    }
}
