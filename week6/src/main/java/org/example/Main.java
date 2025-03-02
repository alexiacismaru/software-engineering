package org.example;

public class Main {
    public static void main(String[] args) {
        TTY tty = new TTY();
        tty.copy(new Keyboard(), new Printer());
    }
}