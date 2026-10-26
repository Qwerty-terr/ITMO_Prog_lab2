package move;

import ru.ifmo.se.pokemon.*;

public final class ThunderShock extends SpecialMove {
    public ThunderShock() {
        super(Type.ELECTRIC, 40, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Thunder Shock";
    }
}
