package com.company;

import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {

    }

    public static void takeOutMoney(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lūdzu norādiet summu, ko vēlaties izņemt");
        int sum = input.nextInt();
        System.out.println("Uzgaidiet, skaita naudu...");
        System.out.println("Lūdzu paņemiet naudu");
        Method1.check();
// TODO: 01.10.21  - verificēt summu - lai nevar ievadīt 43. 
    }
}