package red.part4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class User{
    private Integer id;
    private String name;

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

public class ComparatorTest {
    List<User> users = Arrays.asList(
            new User(5, "james"),
            new User(2, "sonny"),
            new User(3, "anny"));

    @Test
    void test_Comparator_id_asc(){
        Comparator<User> idComparator = (u1, u2) -> u1.getId() - u2.getId();
        Collections.sort(users, idComparator);
        assertThat(users.get(0).getId()).isEqualTo(2);
    }

    @Test
    void test_Comparator_id_desc(){
        Comparator<User> idComparator = (u1, u2) -> u2.getId() - u1.getId();
        Collections.sort(users, idComparator);
        assertThat(users.get(0).getId()).isEqualTo(5);
    }

    @Test
    void test_Comparator_name_asc(){
        Comparator<User> nameComparator = (u1, u2) -> u1.getName().compareTo(u2.getName());
        Collections.sort(users, nameComparator);
        assertThat(users.get(0).getName()).isEqualTo("anny");
    }
}
