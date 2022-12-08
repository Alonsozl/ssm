package com.ssm.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

//    @Autowired
//    private BookService bookService;

//    @GetMapping("/book")
//    public ModelAndView getAllBook(){
//        ModelAndView view = new ModelAndView();
//        List<Book> list = bookService.list(null);
//        for (Book book : list) {
//            view.setViewName("book.html");
//            view.addObject("book", book);
//        }
//        return view;
//    }
//    @GetMapping("/index")
//    public String index() {
//        return "index.jsp";
//    }

//    @PostMapping("/addBook")
//    public String addBook(Book book) {
//        bookService.save(book);
//        return "addBook.html";
//    }

//    @GetMapping("/index")
//    public ModelAndView index(){
//        ModelAndView view = new ModelAndView();
//        view.setViewName("index.jsp");
//        return view;
//    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

//    @GetMapping("/login")
//    public String login(){
//        return "login";
//    }

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView view = new ModelAndView("login");
        return view;
    }

}
