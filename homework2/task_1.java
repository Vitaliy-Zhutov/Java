package lessons_Java_GB.homework2;

public class task_1 {
    public static void main(String[] args){
        System.out.println(parseString("Основание -5, степень 3, результат равен"));
        System.out.println(parseString("Основание 127, степень 2, результат равен"));
        System.out.println(parseString("Основание 33, степень 15, результат равен"));
        System.out.println(parseString("Основание 4, степень 7, результат равен"));

    }

    public static String parseString(String inString){
        String[] strings = inString.split(" ");
        int base = 0;
        int power = 0;
        double product = 0;
        for(int i = 0; i < strings.length; i++){
            strings[i] = strings[i].replace(",", "");
            try {
                Integer.parseInt(strings[i]);
                if(base == 0){
                   base = Integer.parseInt(strings[i]);
                } else {
                    power = Integer.parseInt(strings[i]);
                }
            } catch (NumberFormatException e){
                continue;
            }
            
        }
        product = Math.pow(base, power);
        return inString + " " + String.valueOf(product);
    }
    
}
