package com.example.task04;

import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        Scanner scanner = new Scanner(System.in);
        double result = 0;
        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                result += Double.parseDouble(token);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.printf("%.6f", result);
    }
}
