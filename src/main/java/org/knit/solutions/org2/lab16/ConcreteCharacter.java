package org.knit.solutions.org2.lab16;

class ConcreteCharacter implements Character {
    private char charCode; // Внутреннее состояние (неизменяемое)

    public ConcreteCharacter(char charCode) {
        this.charCode = charCode;
    }

    @Override
    public void render(int x, int y, String style) {
        System.out.printf("Отображаем символ '%c' в позиции (%d, %d) со стилем '%s'\n",
                charCode, x, y, style);
    }
}