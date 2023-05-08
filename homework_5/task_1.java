package lessons_Java_GB.homework_5;

import java.util.HashMap;

public class task_1 {
    public static void main(String[] args){
        
        // Первый список
        System.out.println("Первый список");
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "Понедельник");
        map.put("2", "Вторник");
        map.put("3", "Среда");
        map.put("4", "Четверг");
        map.put("5", "Пятница");
        map.put("6", "Суббота");

        // Добавляем "!"

        map.compute("1", (k, v) -> v += "!");
        map.compute("2", (k, v) -> v += "!");
        map.compute("3", (k, v) -> v += "!");
        map.compute("4", (k, v) -> v += "!");
        map.compute("5", (k, v) -> v += "!");
        map.compute("6", (k, v) -> v += "!");

        map.forEach((a,b) -> System.out.println("Ключь: " + a + ". Значение: " + b));
        System.out.println(" ");

        // Второй список
        System.out.println("Второй список");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("2", "Вторник");
        map2.put("3", "Среда");
        map2.put("4", "Четверг");
        map2.put("5", "Пятница");
        map2.put("6", "Суббота");
        map2.put("7", "Воскресение");

        // Добавляем "!"

        map2.compute("2", (k, v) -> v += "!");
        map2.compute("3", (k, v) -> v += "!");
        map2.compute("4", (k, v) -> v += "!");
        map2.compute("5", (k, v) -> v += "!");
        map2.compute("6", (k, v) -> v += "!");
        map2.compute("7", (k, v) -> v += "!");

        map2.forEach((a,b) -> System.out.println("Ключь: " + a + ". Значение: " + b));
        System.out.println(" ");

        // В третьем списке объединяем список 1 и 2
        System.out.println("Объединенный список из первого и второго");
        HashMap<String, String> map3 = new HashMap<>();

        map3.putAll(map);
        map3.putAll(map2);

        map3.forEach((a,b) -> System.out.println("Ключь: " + a + ". Значение: " + b));
        System.out.println(" ");





    }
    
}
