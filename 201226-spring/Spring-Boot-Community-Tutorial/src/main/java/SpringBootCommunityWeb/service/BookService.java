package SpringBootCommunityWeb.service;

import SpringBootCommunityWeb.domain.Book;
import SpringBootCommunityWeb.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBookList(){
        return bookRepository.findAll();
    }

}
