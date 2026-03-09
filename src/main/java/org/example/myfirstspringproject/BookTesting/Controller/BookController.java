package org.example.myfirstspringproject.BookTesting.Controller;
import org.example.myfirstspringproject.BookTesting.BookModel.Book;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    List<Book> books = new ArrayList<>();

    @PostMapping()
    public List<Book> getBooks(@RequestBody Book book) {
        books.add(book);
        return books;
    }


    @GetMapping()
    public List<Book> books() {
        return books;
    }


    // Get name by id
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // Update name by id

    //
    @PutMapping("/{book-id}")
    public Book updateBookById(@PathVariable("book-id") Integer id , @RequestBody Book book){
        for(Book b : books){
            if(b.getId().equals(id)){
                b.setTitle(book.getTitle());
                b.setPrice(book.getPrice());
            }
        }
        return book;
    }

    @DeleteMapping("/{book-id}")
    public Book deleteBookById(@PathVariable ("book-id")  Integer deleteId , @RequestBody Book book){

        return book;

    }


    //Delete name by id


}













