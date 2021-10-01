package com.company;
import java.util.Scanner;
public class Method1 {
    public static void main(String[] args) {
    }
        public static void check() {
            System.out.println("Vai vēlaties čeku?");
            System.out.println("Izvēlaties 1, lai printētu, vai 2 ja nevēlaties");
            Scanner input = new Scanner(System.in);
            int answerForPrint = input.nextInt();
            if (answerForPrint == 1)
                System.out.println("Lūdzu, Jūsu čeks!");
            else if (answerForPrint == 2)
                System.out.println("Lieliski! Jūs tikko izglābāt koku!");
            else
                System.out.println("Nepareiza komanda!");
    }
}
