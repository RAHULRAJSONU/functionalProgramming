import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private int age;
    private List<String> phoneNumber;

    public User(String name, List<String> phoneNumber){
        this.name = name;
        this.id = UUID.randomUUID();
        this.age = new Random().nextInt(18)+30;
        this.phoneNumber = phoneNumber;
    }

    public User(String name){
        this(name,new ArrayList<>());
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
