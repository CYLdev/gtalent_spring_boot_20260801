package student.cyl.gtalent_spring_boot_20260801.exception;

public class MemberAccountExcption extends ApiException {

    public MemberAccountExcption(String errorKey, String messageCode) {
        super(errorKey, messageCode);
    }
}