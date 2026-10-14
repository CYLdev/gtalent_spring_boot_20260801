package student.cyl.gtalent_spring_boot_20260801.response;

import student.cyl.gtalent_spring_boot_20260801.entity.Book;

public class BookResponse {
    private Long id;

    private String name;

    private Integer price;

    private String purchaseStatus;

    public BookResponse(Book book, String purchaseStatus) {
        this.id = book.getId();
        this.name = book.getName();
        this.price = book.getPrice();
        this.purchaseStatus = purchaseStatus;
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

    public String getPurchaseStatus() {
        return purchaseStatus;
    }

}