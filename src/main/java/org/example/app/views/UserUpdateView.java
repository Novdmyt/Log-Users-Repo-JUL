package org.example.app.views;

import java.util.Scanner;

public class UserUpdateView {
    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter new phone in format xxx xxx-xxxx: ");
        String phone = scanner.nextLine();

        return new String[] {id, phone};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
}
