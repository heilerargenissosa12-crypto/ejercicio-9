package wizardsandwarriors;

/**
 * El Mago (Wizard) es vulnerable por defecto a menos que prepare un hechizo.
 * Si preparó un hechizo, causa 12 puntos de daño; de lo contrario, causa 3 puntos.
 */
public class Wizard extends Fighter {

    private boolean isSpellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    public boolean isVulnerable() {
        return !this.isSpellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter target) {
        return this.isSpellPrepared ? 12 : 3;
    }

    public void prepareSpell() {
        this.isSpellPrepared = true;
    }
}
