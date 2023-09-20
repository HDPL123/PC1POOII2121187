/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author alumno
 */
public class Application {
    public static void main(String[] args) {
        // Configurar SendGrid
        SendGrid sendGrid = new SendGrid("API_KEY");
        MailAdapter sendGridAdapter = new SendGridAdapter(sendGrid);

        // Configurar SMTP
        SMTP smtp = new SMTP("SMTP_SERVER");
        MailAdapter smtpAdapter = new SMTPAdapter(smtp);

        // Usar SendGrid para enviar un correo
        Mail sendGridMail = new Mail("danielito@outlook.es", "correousil@edu.pe", "Asunto", "Cuerpo del correo");
        sendGridAdapter.send(sendGridMail);

        // Usar SMTP para enviar un correo
        Mail smtpMail = new Mail("dani123@outlook.es", "manuel@hotmail.com", "Asunto", "Cuerpo del correo");
        smtpAdapter.send(smtpMail);
    }
}

