package student.cyl.gtalent_spring_boot_20260801.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import student.cyl.gtalent_spring_boot_20260801.request.MailSendRequest;
import student.cyl.gtalent_spring_boot_20260801.response.ApiResponse;
import student.cyl.gtalent_spring_boot_20260801.service.MailService;

@RestController
public class MailController {
    private MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/send/gmail")
    public ApiResponse sendEmail(@Valid @RequestBody MailSendRequest request) {
        mailService.sendEmail(request.getToMailAddress(), request.getSubject(), request.getContent());
        return new ApiResponse("寄送Gmail成功");
    }

    // 練習1: 改成帶入 to、subject、text 參數 用post

    // 練習2: 新增/修改/刪除書籍 寄送gmail通知 
}