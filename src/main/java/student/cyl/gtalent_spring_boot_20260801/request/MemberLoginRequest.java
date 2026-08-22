package student.cyl.gtalent_spring_boot_20260801.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import student.cyl.gtalent_spring_boot_20260801.constant.ResponseMessages;

@Getter
@Setter
public class MemberLoginRequest {

    @NotBlank(message = ResponseMessages.MEMBER_ACCOUNT_REQUIRED)
    private String account;

    @NotBlank(message = ResponseMessages.MEMBER_PASSWORD_REQUIRED)
    private String password;
}