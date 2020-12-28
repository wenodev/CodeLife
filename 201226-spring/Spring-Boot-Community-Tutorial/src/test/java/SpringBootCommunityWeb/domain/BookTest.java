package SpringBootCommunityWeb.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void test(){

        String testTitle = "title-test-1";

        Book book = Book.builder()
                .title(testTitle)
                .build();

        assertEquals(book.getTitle(), testTitle);


    }


}