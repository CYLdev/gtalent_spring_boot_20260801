package student.cyl.gtalent_spring_boot_20260801.exception;

public class AuthException extends ApiException {

    public AuthException(String errorKey, String messageCode) {
        super(errorKey, messageCode);
    }
}