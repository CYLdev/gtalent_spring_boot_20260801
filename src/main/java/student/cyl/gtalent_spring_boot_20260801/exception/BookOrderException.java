package student.cyl.gtalent_spring_boot_20260801.exception;

public class BookOrderException extends ApiException {
    public BookOrderException(String errorKey, String message) {
        super(errorKey, message);
    }
    
}