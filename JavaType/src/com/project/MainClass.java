package com.project;

import java.util.Scanner;

public class MainClass {

    private static boolean summa1;

    public static void main(String[] args) {
        /**
         * *Type:[Tip]
         * -String
         * -Integer [Long]
         * -Double
         * -Float
         * -Char
         * -Boolean
         * -Byte
         *  -Var // variable
         */
        System.out.println("HELLO world");
        //--> Coment
        String name = "This is my first java project";
        System.out.println("" + name);
        int num1 = 17;
        int num2 = 12;
        int num3 = 7;

        int sum = num1 + num2 + num3;
        System.out.println(" Sonlar summasi: " + sum);


        int num4 = 6, num5 = 9, num6 = 171, num7 = 11, num8 = -1;

        int num9, num10, num11;
        num9 = 123;
        num10 = 321;
        num11 = 200;

        int Summa1 = num4 + num5 + num6 + num7 + num8 + num9 + num10 + num11;
        System.out.println(summa1);


        // Double
        double zarplata = 546.78;
        double zarplata1 = 647.90;
        double zarplata2 = 563.90;

        double zarSumma  = zarplata + zarplata1 + zarplata2;
        System.out.println("Zarplata: " + zarSumma + " $ ");

       double zarUmn =   zarplata * zarplata1 * zarplata2;
       System.out.println("Zarplata:" + zarUmn + " $ " );


       //Cmd - terminal
        Scanner scanner = new Scanner(System. in); ///in - input . out - output

//        System.out.print(" num kiting :");
//        int znacheniya = scanner.nextInt();
//        int umn1 = znacheniya * 3;
//        System.out.println(" umn1 =:" + umn1);

        System.out.println(" ------- ");

        System.out.print( "Your name :");
        String fullName = scanner.nextLine();  // string
        System.out.println("Your family name: ");
        String familyName = scanner.nextLine();

        System.out.println(" My name is " + fullName + "  " + familyName);


        System.out.println("-----------------");





















    }
}





