package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prev = System.in.read(), next;
        while (prev != -1) {
            next = System.in.read();
            if (prev != 13 || next != 10) {
                System.out.write(prev);
            }
            prev = next;
        }
        System.out.flush();
    }
}
