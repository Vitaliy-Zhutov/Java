package lessons_Java_GB.homework_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class task_1 {
    public static void main(String[] args){
        
        // 1.Алгоритм обратной сортировки списков компаратором
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 1, 3, 5, 7);
        System.out.println(list);
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // 2. Дан произвольный список целых чисел, удалить из него чётные числа
        List <Integer> list2 = new ArrayList <Integer>();

        list2.add(8);
        list2.add(4);
        list2.add(6);
        list2.add(7);
        list2.add(3);
        list2.add(5);
        System.out.println(list2);
        
        list2.removeIf(n -> (n % 2) == 0);
        System.out.println(list2);

        // 3. Задан целочисленный список ArrayList. 
        //Найти минимальное, максимальное и среднее из этого списка.

        List <Integer> list3 = new ArrayList <Integer>();

        list3.add(1);
        list3.add(3);
        list3.add(5);
        list3.add(2);
        list3.add(4);
        list3.add(6);
        System.out.println(list3);

        int min = list3.get(0);
        int max = list3.get(0);
        int sum = 0;
        int n = list3.size();

        //Максимальное значение
        for (int i = 1; i < n; i++) {
            if (list3.get(i) < min) {
                min = list3.get(i);
            }
        }

        //Минимальное значение
        for (int i = 1; i < n; i++) {
            if (list3.get(i) > max) {
                max = list3.get(i);
            }
        }

        //Среднее значение
        sum = (min + max) / 2;
        
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + sum);


        // 4. Дано два целочисленных списка, объеденить их не допуская элементы 
        //второго списка уже встречающиеся в первом.

        //первый список
        List <Integer> list4 = new ArrayList <Integer>();

        list4.add(1);
        list4.add(3);
        list4.add(5);
        list4.add(2);
        list4.add(4);
        list4.add(6);
        System.out.println(list4);

        //второй список
        List <Integer> list5 = new ArrayList <Integer>();

        list5.add(5);
        list5.add(7);
        list5.add(9);
        list5.add(6);
        list5.add(8);
        list5.add(10);
        System.out.println(list5);
        
        
        list5.removeAll(list4);
        System.out.println(list5);
        
        list5.addAll(list4);
        System.out.println(list5);

        Collections.sort(list5);
        System.out.println(list5);

        // 5. Создать ArrayList<Integer> и добавить нулевым 
        //эллементом ноль 10000 раз.

        double begin = System.currentTimeMillis();
        ArrayList<Integer> list6 = new ArrayList<Integer>(Collections.nCopies(10000, 0));
        System.out.println(list6);
        double end = System.currentTimeMillis();
        System.out.println("Время: " + (end - begin));

        // 6. Повторить пятый пункт но с LinkedList.
        double begin2 = System.currentTimeMillis();
        LinkedList<Integer> list7 = new LinkedList<Integer>(Collections.nCopies(10000, 0));
        System.out.println(list7);
        double end2 = System.currentTimeMillis();
        System.out.println("Время: " + (end2 - begin2));

    }
}
