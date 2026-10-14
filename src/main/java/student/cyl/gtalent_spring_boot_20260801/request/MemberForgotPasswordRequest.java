package student.cyl.gtalent_spring_boot_20260801.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import student.cyl.gtalent_spring_boot_20260801.constant.ResponseMessages;

@Getter
@Setter
public class MemberForgotPasswordRequest {
    
    @NotBlank(message = ResponseMessages.MEMBER_ACCOUNT_OR_EMAIL_REQUIRED)
    @Size(max = 128, message = ResponseMessages.MEMBER_ACCOUNT_OR_EMAIL_MAX)
    private String accountOrEmail;
}