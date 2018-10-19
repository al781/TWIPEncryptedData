package com.company;

import java.util.Scanner;

public class Main
    {

        private static Scanner strscan = new Scanner(System.in);
        private static Scanner numscan = new Scanner(System.in);
        private static Cipherer cipher = new Cipherer();
        public static void main(String[] args)
            {
                Prompt();
            }
        private static void Prompt()
            {
                System.out.println("What do you want to do?\n0 for Encryption\n1 for Decryption\nAnything else to exit");
                switch (strscan.nextLine())
                    {
                        case "0":
                            System.out.println("Enter what you would like to encrypt.");
                            String s = strscan.nextLine();
                            System.out.println("Enter what you want to encrypt by.\nEnter an integer or else I will crash.");
                            int i = numscan.nextInt();
                            System.out.println(cipher.encrypt(s, i));
                            break;
                        case "1":
                            System.out.println("Enter what you would like to decrypt.");
                            String s1 = strscan.nextLine();
                            System.out.println("Enter what you want to decrypt by.\nEnter an integer or else I will crash.");
                            int i1 = numscan.nextInt();
                            System.out.println(cipher.decrypt(s1, i1));
                            break;
                        default:
                            System.exit(0);
                            break;
                    }
                Prompt();
            }
    }