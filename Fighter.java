package wizardsandwarriors;

/**
 * Ejercicio 9: Wizards and Warriors
 * Concepto: Inheritance / Overriding (Herencia y sobrescritura de métodos)
 *
 * Clase base que representa a un combatiente en un juego de rol.
 */
public class Fighter {

    public boolean isVulnerable() {
        return true;
    }

    public int getDamagePoints(Fighter fighter) {
        return 1;
    }

    @Override
    public String toString() {
        return "Fighter is a generic fighter";
    }
}
