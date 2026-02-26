package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // - проверить, что получилось 351.731900

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT);
        double result = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        System.out.printf(scanner.locale(), "%.6f", result);
    }
}
