package org.knit.solutions.org2.lab16;

import java.util.HashMap;
import java.util.Map;

class CharacterFactory {
    private static final Map<java.lang.Character, ConcreteCharacter> characters = new HashMap<>();

    public static Character getCharacter(char charCode) {
        // Используем java.lang.Character для избежания конфликта имен
        java.lang.Character key = java.lang.Character.valueOf(charCode);
        ConcreteCharacter character = characters.get(key);

        if (character == null) {
            character = new ConcreteCharacter(charCode);
            characters.put(key, character);
            System.out.println("Создан новый символ: " + charCode);
        }

        return character;
    }
}