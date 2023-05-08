package lessons_Java_GB.homework2;

public class task_2 {
    public static void main(String[] args){

        String myString = """
                Самолет построим сами,
                Понесемся над лесами,
                Понесемся над лесами,
                А потом вернемся к маме.
                """;
        String query = "лесами";

        double begin = System.currentTimeMillis();
        System.out.println(myString);
        System.out.println(myString.replace(query, "полями"));
        double end = System.currentTimeMillis();
        System.out.println("Время: " + (end - begin));

        begin = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(myString);
        while(sb.indexOf(query) > 0){
            sb.replace(sb.indexOf(query), sb.indexOf(query) + query.length(), "полями");
        }
        System.out.println(sb);
        end = System.currentTimeMillis();
        System.out.println("Время: " + (end - begin));
    }
}
