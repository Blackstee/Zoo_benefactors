package com.company;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String [] menu = {"\nCreate new user\t\t 1" , "Create new Animal\t 2", "Create new Need\t\t 3", "Create new Document\t 4", "Exit \t\t\t\t 0"};
        while (true) {
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < menu.length; i++) {
                System.out.println(menu[i]);
            }
            int num = sc.nextInt();
            switch (num) {

                case 1:
                    String[] second_menu = {"\nCreate new admin\t 1", "\nCreate new benefactor\t 2"};
                    // put here the variants for user creating
                    break;
                case 2:

                    // put here the variants for Animal creating
                    break;
                case 3:

                    // put here the variants for Need creating
                    break;
                case 4:

                    // put here the variants for Document creating
                    break;
                case 0:

                    //exiting program1
                    return;


            }
        }
    }
}
