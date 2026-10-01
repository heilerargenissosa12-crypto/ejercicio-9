# Ejercicio 9: Wizards and Warriors

- **Concepto:** Inheritance / Overriding (Herencia y polimorfismo con `extends` y `@Override`)
- **Plataforma:** Exercism (Java Track)

## Descripción del Problema
Modelar personajes de rol (RPG) utilizando una jerarquía de herencia:
- **`Fighter`**: Clase base.
- **`Warrior`**: Especialización de combatiente cuerpo a cuerpo.
  - Nunca es vulnerable (`isVulnerable()` retorna `false`).
  - Causa 10 puntos de daño a un objetivo vulnerable y 6 a uno no vulnerable.
  - `toString()` retorna `"Fighter is a Warrior"`.
- **`Wizard`**: Especialización de lanzador de conjuros.
  - Es vulnerable por defecto a menos que invoque `prepareSpell()`.
  - Causa 12 puntos de daño si tiene el hechizo preparado y 3 puntos si no.
  - `toString()` retorna `"Fighter is a Wizard"`.

## Cómo ejecutar en Visual Studio / VS Code:
Abre `Main.java` y haz clic en **Run** o presiona `F5`.
