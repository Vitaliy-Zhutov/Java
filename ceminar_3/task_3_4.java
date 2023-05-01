package lessons_Java_GB.ceminar_3;

import java.io.*;
import java.util.*;

//3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. 
//Фамилии, имена, отчества, возрас и пол в отдельных списках.
//4.Отсортировать по возрасту используя дополнительный список индексов.

public class task_3_4 {
    static ArrayList<String> family = new ArrayList<>();
    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> soname = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();
    static ArrayList<Boolean> gender = new ArrayList<>();
    static LinkedList<Integer> key = new LinkedList<>();
    public static void main(String[] args){

        String text = "";
        try {
            FileReader re = new FileReader("lessons_Java_GB\\ceminar_3\\ts2.sql");
            while (re.ready()) text += (char)re.read();
        } catch (IOException e) {throw new RuntimeException(e);}
    
        String [] str = text.split("\n");
        for (int i = 0; i < str.length; i++){
            String [] sb = str[i].split(" ");
            family.add(sb[0]);
            name.add(sb[1]);
            soname.add(sb[2]);
            age.add(Integer.parseInt(sb[3]));
            gender.add(sb[4].contains("М")?true:false);
            key.add(i);
        }

        System.out.println(family);
        System.out.println(name);
        System.out.println(soname);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(key);
        System.out.println();

        int cnt = key.size()-1;
        while (cnt > -1) {
            int max_age = age.get(key.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++) {
                if (max_age < age.get(key.get(i))) {
                    max_age = age.get(key.get(i));
                    index = i;
                }
            }

            int tmp = key.get(cnt);
            key.set(cnt, key.get(index));
            key.set(index, tmp);
            cnt--;
        }

        for (int i: key) {
            System.out.println(getFIO(i));
        }

    }

    private static String getFIO(int index){
        return family.get(index) + " "
                + name.get(index) + " "
                + soname.get(index) + " "
                + age.get(index) + " "
                + (gender.get(index)?"М":"Ж");
    }
}
