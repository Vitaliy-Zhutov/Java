import java.util.Arrays;
import java.util.Random;

/* 
создать рандомное число, результат развернуть.
*/  

public class task_1 {
    public static void main(String[] args) {
        int i;
        String[] iString;
        Random random = new Random();
        i = random.nextInt(10000);

        System.out.println(i);
        iString = String.valueOf(i).split("");
        System.out.println(Arrays.toString(iString));
        for(int j = iString.length-1; j >= 0; j--){
            System.out.print(iString[j]);
        }
    }
}