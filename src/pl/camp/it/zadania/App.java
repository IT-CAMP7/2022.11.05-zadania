package pl.camp.it.zadania;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            String boki = scanner.nextLine();
            String[] sides = boki.split(" ");
            if(sides.length < 3 || sides.length > 6) {
                System.out.println("Nieprawidlowa ilosc bokow !!");
            } else {
                isRunning = false;
            }


        }
    }
}
