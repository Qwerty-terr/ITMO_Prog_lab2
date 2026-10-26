package move;

import ru.ifmo.se.pokemon.*;

public final class PlayRough extends PhysicalMove {
    public PlayRough() {
        super(Type.FAIRY, 90, 0.9);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            p.setMod(Stat.ATTACK, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Play Rough";
    }
}
