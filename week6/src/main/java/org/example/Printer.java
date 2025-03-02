package org.example;

public class Printer implements OutputDevice {

    @Override
    public void write(char c) {
        System.out.println("Printer" + c);
    }
}
