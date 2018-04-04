import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Rahul", "Anil", "Mukesh","Shushil","bablu");
        System.out.println("Traditional Way-:");
        Utils.newLine();
        for (String name : names) {
            if(!name.equals("Mukesh")){
                System.out.println(name);
            }
        }

        System.out.println("Functional Way-:");
        Utils.newLine();
        names.stream()
                .filter(FilterExample::checkForMukesh)
                .forEach(System.out::println);

    }

    private static boolean checkForMukesh(String s) {
        return !s.equals("Mukesh");
    }


}
