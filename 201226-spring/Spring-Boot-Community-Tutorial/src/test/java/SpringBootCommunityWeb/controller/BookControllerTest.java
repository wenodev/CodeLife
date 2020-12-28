package SpringBootCommunityWeb.controller;

import SpringBootCommunityWeb.domain.Book;
import SpringBootCommunityWeb.domain.BookRepository;
import SpringBootCommunityWeb.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.hamcrest.Matchers.contains;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BookController.class)
class BookControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    BookService bookService;

    @Test
    public void Book_MVC_test() throws Exception {

        String testTitle = "title-test-1";

        Book book = Book.builder()
                .title(testTitle)
                .build();

        given(bookService.getBookList()).willReturn(Collections.singletonList(book));

        mvc.perform(get("/books"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("bookList"))
                .andExpect(model().attribute("bookList", contains(book)));
    }


}