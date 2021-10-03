
    package com.company;
    import java.util.Scanner;
    public class Method5 {
            public static void main(String[] args) {
            }

                public static void veiktMaksajumu(){
                    System.out.println("Lūdzu izvēlieties pakalpojumu sniedzēju: ");
                    System.out.println("1 - Electrum");
                    System.out.println("2 - Tet");
                    System.out.println("3 - LMT");
                    System.out.println("4 - Tele2");

                    Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                    System.out.println("Lūdzu ierakstiet rēķina Nr.:");
                    String rekins= sc.next();
                    System.out.println("Lūdzu ievadiet summu:");
                    double sum = sc.nextDouble();
                    System.out.println("Jūsu rēķins veiksmīgi samaksāts");
                    Method1.check();
                }

    }

