package com.company;
import java.util.Scanner;

public class Method4 {
    public static void main(String[] args) {

        }

    public static void inputMoney(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lūdzu norādiet summu, ko vēlaties ielikt kontā");
        int sum = input.nextInt();
        System.out.println("Lūdzu ievietojiet naudu atvilknē");
        System.out.println("Uzgaidiet, skaita naudu...");
        System.out.println(sum + " eur ieskaitīti jūsu kontā");
        Method1.check();

    }
}