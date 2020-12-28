package SpringBootCommunityWeb;

import SpringBootCommunityWeb.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootCommunityWebApplicationTests {

	@Test
	void contextLoads() {

		String testTitle = "title-test-1";

		Book book = Book.builder()
				.title(testTitle)
				.build();

		assertEquals(book.getTitle(), testTitle);

	}

}
