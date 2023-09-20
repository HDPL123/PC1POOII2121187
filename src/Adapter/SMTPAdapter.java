/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import Clases.Mail;
import Clases.SMTP;
import Interface.MailAdapter;


abstract class SMTPAdapter implements MailAdapter {
    private SMTP smtp;

    public SMTPAdapter(SMTP smtp) {
        this.smtp = smtp;
    }

    @Override
    public void send(Mail mail) {
       
        smtp.sendMail(mail);
       
    }
}

