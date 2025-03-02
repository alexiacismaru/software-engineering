package org.example;

import java.util.Scanner;

public class Keyboard {
    Scanner scanner;

    public Keyboard() {
        this.scanner = new Scanner(System.in);
    }

    public char readKeyboard(){
        System.out.println("Enter char");
        return scanner.next().charAt(0);
    }
}
