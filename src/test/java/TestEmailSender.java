import net.sunofbeach.blog.utii.EmailSender;

import javax.mail.MessagingException;

public class TestEmailSender {
    public static void main(String[] args) throws MessagingException {
        EmailSender.subject("测试邮件发送")
                .from("王生")
                .text("我发给你的内容：我是帅B")
                .to("qiu9939@126.com")
                .send();
    }
}
