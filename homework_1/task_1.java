/* 
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE 
сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i 
и сохранить в массив m2
*/
package lessons_Java_GB.homework_1;
import java.util.ArrayList;
import java.util.Random;


public class task_1 {
    
    public static void main(String[] args){   
        
        int i = RandomInt(2000);
        System.out.println("Случайное число = " + i);
        
        int n = olderBit(i);
        System.out.println("Номер старшего значения бита =  " + n);

        ArrayList<Integer> m1 = maxShort(i, n, Short.MAX_VALUE);
        System.out.print("Кратные n числа в диапазоне от i до Short.MAX_VALUE: " + m1);

        ArrayList<Integer> m2 = minShort(i, n, Short.MIN_VALUE);
        System.out.print("Кратные n числа в диапазоне от Short.MAX_VALUE до i: " + m2);



    }

    // 1. Cлучайное целое число
    public static int RandomInt(int k){   
        int i = new Random().nextInt(k);
        return i;
    }
    // 2. Номер старшего значащего бита выпавшего числа
    public static int olderBit(int n){
        int intBinary = Integer.toBinaryString(n).length();
        return intBinary;
    
    }

    // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE 
    // сохранить в массив m1
    public static ArrayList<Integer> maxShort(int i, int n, int max){
        ArrayList<Integer> m1 = new ArrayList<Integer>();
        for (int j = i + 1; j <= Short.MAX_VALUE; ++j){
            if ( j % n == 0){
                m1.add(j);
            }    
        }
        return m1;
    }

    // 4. Найти все кратные n числа в диапазоне от Short.MIN_VALUE до i 
    // сохранить в массив m2
    public static ArrayList<Integer> minShort(int i, int n, int min){
        ArrayList<Integer> m2 = new ArrayList<Integer>();
        for (int j = i - 1; j >= Short.MIN_VALUE; j--){
            if ( j % n != 0){
                m2.add(j);
            }    
        }
        return m2;
    }

}
