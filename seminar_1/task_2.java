import java.util.Arrays;

//Создать с полных ФИО, инициалы

public class task_2 {
    public static void main(String[] args){
        String fio = "Иванов Иван Иванович";
        String result;
        String[] fio_array = fio.split(" ");
        System.out.println(Arrays.toString(fio_array));
        result = fio_array[0] + ' ' + fio_array[1].charAt(0) + '.' + fio_array[2].charAt(0) + '.';
        System.out.println(result);



    }
}
