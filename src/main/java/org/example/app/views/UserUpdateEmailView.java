package org.example.app.views;

import java.util.Scanner;

public class UserUpdateEmailView {
    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter new email in format example@ex.com: ");
        String email = scanner.nextLine();

        return new String[] {id, email};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

