import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapExample {
    public static void main(String[] arg){
        List<User> users = Arrays.asList(
        new User("Rahul", Arrays.asList("1")),
        new User("Anil", Arrays.asList("2")),
        new User("Shushil", Arrays.asList("3")),
        new User("Mukesh", Arrays.asList("4")),
        new User("Aditya", Arrays.asList("5"))
        );

        Optional<String> phoneNumber = users.stream()
                .map(user -> user.getPhoneNumber().stream())
                .flatMap(stringStream -> stringStream.filter(phone -> phone.equals("5")))
                .findAny();
        phoneNumber.ifPresent(System.out::println);
    }
}
