package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.LoggerFactory;

@Getter @Setter
public class BookForm {

    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    private String author;
    private String isbn;
}
