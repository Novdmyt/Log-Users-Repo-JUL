package org.example.app.controllers;

import org.example.app.services.UserUpdateEmailService;

import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.views.UserUpdateEmailView;


public class UserUpdateEmailController {
    UserUpdateEmailService service;

    UserUpdateEmailView viewEmail;


    public UserUpdateEmailController(UserUpdateEmailService service, UserUpdateEmailView viewEmail) {
        this.service = service;
        this.viewEmail = viewEmail;
    }


    public void updateUserEmail(){
        String str = service.updateUser(viewEmail.getData());
        if(str.equals(Constants.DB_ABSENT_MSG)){
            viewEmail.getOutput(str);
            System.exit(0);
        }else {
            viewEmail.getOutput(str);
            AppStarter.startApp();
        }
    }
}