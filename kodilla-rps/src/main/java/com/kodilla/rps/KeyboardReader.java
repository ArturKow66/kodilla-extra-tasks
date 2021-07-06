package com.kodilla.rps;

import java.util.Scanner;

public class KeyboardReader {
    private String keyboardRead;
    Scanner scanner = new Scanner(System.in);

    public String readKeyboard() {
        try {
            keyboardRead = scanner.nextLine();
        } catch (Exception a) {
            System.out.println("Exception: " + a);
        }
        return keyboardRead;
    }

    public char[] readKeyboardToChar() {
        try {
            keyboardRead = scanner.nextLine();
        } catch (Exception a) {
            System.out.println("Exception: " + a);
        }
        keyboardRead = scanner.nextLine();
        return keyboardRead.toCharArray();
    }
}
