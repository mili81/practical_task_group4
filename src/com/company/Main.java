package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Labdien! Lūdzu uzvēlēties operāciju:");
        System.out.println("1 - Izņemt naudu");
        System.out.println("2 - Ielikt naudu");
        System.out.println("3 - Samaksāt rēķinu");
        System.out.println("4 - Pārbaudīt bilanci");

        int operation = input.nextInt();
        switch (operation) {
            case 1:
                Method3.takeOutMoney();
                break;
            case 2:
                Method4.inputMoney();
                break;
            case 3:
                //ielikt metodi par rēķinu
                break;
            case 4:
                Method6.bilance(1000000);
                break;
            default:
                System.out.println("Izvēlaties metodi no piedāvātā saraksta");
                break;
        }
    }
}
