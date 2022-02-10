package red.part7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

class User{
    private Integer id;
    private String name;

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class OptionalTest {
    User user1 = new User(5, "james");
    User user2 = new User(2, "sonny");
    User user3 =new User(3 );

    @Test
    void test_init(){
        Optional.of(user2.getName());
        Optional.ofNullable(user3);
        Optional.empty();
    }

    @Test
    void test_orElse(){
        Optional.of(user3.getName()).orElse("defaultName");
        Optional.of(user3.getName()).orElseGet(() -> "defaultName");
        Optional.of(user3.getName()).orElseThrow(() -> new IllegalArgumentException());
    }

    @Test
    void test_ifPresent_with_null(){
        Optional<User> user = Optional.ofNullable(null);
        user.ifPresent(u -> System.out.println(u.getName()));
    }

    @Test
    void test_ifPresent_with_non_null(){
        Optional<User> user = Optional.ofNullable(new User(1, "weno"));
        user.ifPresent(u -> System.out.println(u.getName()));
    }

}
