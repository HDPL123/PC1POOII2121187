/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import Interface.MailAdapter;
import java.io.IOException;
import Clases.Mail;
import Clases.SMTP;

/**
 *
 * @author alumno
 */
public class SendGridAdapter implements MailAdapter {
    private SendGrid sendGrid;

    public SendGridAdapter(SendGrid sendGrid) {
        this.sendGrid = sendGrid;
    }

    @Override
    public void send(Mail mail) {
        // Adaptar la llamada al API de SendGrid
        try {
            Request request = new Request();
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());

            Response response = sendGrid.api(request);

            
        } catch (IOException ex) {
           
        }
    }
}
