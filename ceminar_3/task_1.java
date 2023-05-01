package lessons_Java_GB.ceminar_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task_1 {


    public static void main(String[] args) throws Exception{

        //1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль 
        //используя классы FileWriter и FileReader
        try(FileWriter txtWrit = new FileWriter("lessons_Java_GB\\ceminar_3\\ts1.sql")) { 
            txtWrit.write("Текст для записи в файл ts1.sql и последующего вывода в консоль"); 
            } 
            catch(IOException e){ 
                {throw new RuntimeException(e);} 
            }

            System.out.println();       

        FileReader txtRead = new FileReader("lessons_Java_GB\\ceminar_3\\ts1.sql");
        Scanner scan = new Scanner(txtRead);
            while (scan.hasNextLine()) {
                System.out.print(scan.nextLine());
            }
        scan.close();
        txtRead.close();
    }
}
