package wizardsandwarriors;

/**
 * El Guerrero (Warrior) es resistente y nunca es vulnerable.
 * Causa 10 puntos de daño a objetivos vulnerables y 6 puntos si no son vulnerables.
 */
public class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter target) {
        return target.isVulnerable() ? 10 : 6;
    }
}
