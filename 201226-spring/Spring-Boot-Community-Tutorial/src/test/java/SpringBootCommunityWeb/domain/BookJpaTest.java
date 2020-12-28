package SpringBootCommunityWeb.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BookJpaTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void Book_save_test(){

        String testTitle = "title-test-1";

        Book book = Book.builder()
                .title(testTitle)
                .build();

        testEntityManager.persist(book);
        assertEquals(bookRepository.getOne(book.getIdx()), book);
    }

}