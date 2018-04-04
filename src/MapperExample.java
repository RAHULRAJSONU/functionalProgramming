import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Rahul", "Anil", "Mukesh","Shushil","bablu");
        System.out.println("Traditional Way-:");
        Utils.newLine();
        for (String name : names) {
            if (checkForMukesh(name)){
                User user = new User(name);
                System.out.println(user);
            }
        }
        System.out.println("Functional Way-:");
        Utils.newLine();
        names.stream()
                .filter(MapperExample::checkForMukesh)
                .map(User::new)
                .forEach(System.out::println);

        List<User> userList = names.stream()
                .filter(MapperExample::checkForMukesh)
                .map(User::new)
                .collect(Collectors.toList());
        int sumAge = userList.stream()
                .mapToInt(User::getAge)
                .sum();
        System.out.println(sumAge);

    }

    private static boolean checkForMukesh(String s) {
        return !s.equals("Mukesh");
    }
}
