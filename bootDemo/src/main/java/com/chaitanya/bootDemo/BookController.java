package com.chaitanya.bootDemo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping(path="/book")
	public List<Book> getAllbooks(){
		

		
		Book book1=new Book();
		book1.setId(21);
		book1.setName("lord of the ring");
	    book1.setAuthor("mikeljordon");
		
	    Book book2=new Book();
		book2.setId(22);
		book2.setAuthor("chaitanya");
		book2.setName("harry potter");
		
		List<Book> list=new ArrayList<>();
		
		list.add(book1);
		list.add(book2);
		
		return list;
	}
}
