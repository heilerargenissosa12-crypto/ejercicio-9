package wizardsandwarriors;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 9: Wizards and Warriors (Inheritance)");
        System.out.println("==================================================");

        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();

        System.out.println("1. Representaciones en texto:");
        System.out.println("   " + warrior);
        System.out.println("   " + wizard);

        System.out.println("\n2. Vulnerabilidad inicial:");
        System.out.println("   Guerrero vulnerable? " + warrior.isVulnerable() + " (Esperado: false)");
        System.out.println("   Mago vulnerable?     " + wizard.isVulnerable() + " (Esperado: true)");

        System.out.println("\n3. Ataque de Guerrero contra Mago (vulnerable):");
        int warriorDmg = warrior.getDamagePoints(wizard);
        System.out.println("   Daño causado: " + warriorDmg + " (Esperado: 10)");

        System.out.println("\n4. Ataque de Mago sin hechizo contra Guerrero:");
        int wizardDmgNoSpell = wizard.getDamagePoints(warrior);
        System.out.println("   Daño causado: " + wizardDmgNoSpell + " (Esperado: 3)");

        System.out.println("\n5. Mago prepara hechizo:");
        wizard.prepareSpell();
        System.out.println("   Mago vulnerable ahora? " + wizard.isVulnerable() + " (Esperado: false)");
        int wizardDmgWithSpell = wizard.getDamagePoints(warrior);
        System.out.println("   Daño con hechizo:      " + wizardDmgWithSpell + " (Esperado: 12)");

        boolean ok = !warrior.isVulnerable() &&
                     warriorDmg == 10 &&
                     wizardDmgNoSpell == 3 &&
                     !wizard.isVulnerable() &&
                     wizardDmgWithSpell == 12;

        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
