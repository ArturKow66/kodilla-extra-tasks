package com.kodilla.rps;

import java.util.Scanner;

public class KeyboardReader {
    Scanner scanner = new Scanner(System.in);

    public String readKeyboard() {
        return scanner.nextLine();
    }

    public char[] readKeyboardToChar() {
        String s = scanner.nextLine();
        return s.toCharArray();
    }
}
