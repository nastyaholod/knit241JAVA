package org.knit.solutions.org2.lab16;


import org.knit.solutions.annotations.Discription;

@Discription(value = 16, name = "Приспособленец (Flyweight)")
public class Task16 {
    public static void main(String[] args) {
        String text = "Hello, Flyweight!";
        String style = "Arial-12";

        // Отображаем текст с использованием приспособленцев
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            Character character = CharacterFactory.getCharacter(c);
            character.render(i * 10, 0, style); // x увеличивается для каждого символа
        }

        // Демонстрация повторного использования символов
        System.out.println("\nПовторное использование символов:");
        Character h = CharacterFactory.getCharacter('H');
        h.render(100, 50, "Times New Roman-14");
    }
}
