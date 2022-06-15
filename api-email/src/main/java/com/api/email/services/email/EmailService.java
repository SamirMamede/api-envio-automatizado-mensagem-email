package com.api.email.services.email;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.api.email.enums.email.StatusEmail;
import com.api.email.models.email.EmailModel;
import com.api.email.models.user.User;
import com.api.email.repositories.email.EmailRepository;
import com.api.email.repositories.user.UserRepository;


@Service
public class EmailService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSender;

    public EmailModel sendEmail(EmailModel emailModel) {
        emailModel.setSendDateEmail(LocalDateTime.now());
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(emailModel.getEmailFrom());
            message.setTo(emailModel.getEmailTo());
            message.setSubject(emailModel.getSubject());
            message.setText(emailModel.getText());
            emailSender.send(message);

            emailModel.setStatusEmail(StatusEmail.SENT);
        } catch (MailException e){
            emailModel.setStatusEmail(StatusEmail.ERROR);
        } finally {
            return emailRepository.save(emailModel);
        }
    }

    public EmailModel sendEmailBday(EmailModel emailModel, User user){
        emailModel.setSendDateEmail(LocalDateTime.now());
        try{
            SimpleMailMessage messageBday = new SimpleMailMessage();
            messageBday.setFrom(emailModel.getEmailFrom());
            messageBday.setTo(user.getEmailUser());
            messageBday.setSubject(emailModel.getSubject());
            messageBday.setText(emailModel.getText());
            emailSender.send(messageBday);

            emailModel.setStatusEmail(StatusEmail.SENT);
            emailModel.setEmailTo(user.getEmailUser());
        } catch (MailException e){
            emailModel.setStatusEmail(StatusEmail.ERROR);
        } finally{
            return emailRepository.save(emailModel);
        }
    }
}
