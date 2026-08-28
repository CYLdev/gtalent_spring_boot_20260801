package student.cyl.gtalent_spring_boot_20260801.exception;

// 查不到指定資料時使用的通用例外。
public class ResourceNotFoundException extends ApiException {

    public ResourceNotFoundException(String errorKey, String messageCode) {
        super(errorKey, messageCode);
    }

}