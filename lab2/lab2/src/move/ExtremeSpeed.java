package move;

import ru.ifmo.se.pokemon.*;

public final class ExtremeSpeed extends PhysicalMove {
    public ExtremeSpeed() {
        super(Type.NORMAL, 80, 1, 2, 1);
    }

    @Override
    protected String describe() {
        return "использует Extreme Speed";
    }
}
