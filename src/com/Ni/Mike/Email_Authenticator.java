package com.Ni.Mike;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * Created by a20046 on 12/9/2016.
 */


public class Email_Authenticator extends Authenticator {
    String userName = null;
    String password = null;
    public Email_Authenticator() {
    }
    public Email_Authenticator(String username, String password) {
        this.userName = username;
        this.password = password;
    }
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(userName, password);
    }
}
