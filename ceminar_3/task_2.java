package lessons_Java_GB.ceminar_3;

import java.io.FileReader;
import java.io.IOException;

public class task_2 {
    public static void main(String[] args){
        //2.Загрузить из файла многострочный текст формата ФИО возраст и пол
        //через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"

        String text = "";
        try {
            FileReader re = new FileReader("lessons_Java_GB\\ceminar_3\\ts2.sql");
            while (re.ready()) text += (char)re.read();
        } catch (IOException e) {throw new RuntimeException(e);}
    
        String [] str = text.split("\n");
        for (int i = 0; i < str.length; i++){
            String [] sb = str[i].split(" ");
            
            System.out.println(sb[0] + " " 
                + sb[1].charAt(0) + "." 
                + sb[2].charAt(0) + "." + " " 
                + sb[3] + " " 
                + sb[4]);
        }
        
    }
}
