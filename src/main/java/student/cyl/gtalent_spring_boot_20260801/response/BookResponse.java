package student.cyl.gtalent_spring_boot_20260801.response;

import student.cyl.gtalent_spring_boot_20260801.entity.Book;

public class BookResponse {
    private Long id;

    private String name;

    private Integer price;

    public BookResponse(Book book) {
        this.id = book.getId();
        this.name = book.getName();
        this.price = book.getPrice();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

}