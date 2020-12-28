package SpringBootCommunityWeb.controller;

import SpringBootCommunityWeb.domain.BookRepository;
import SpringBootCommunityWeb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String getBookList(Model model){
        model.addAttribute("bookList", bookService.getBookList());
        return "book";
    }

}
