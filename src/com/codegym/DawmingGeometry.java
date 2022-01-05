package com.codegym;

import java.util.Scanner;

public class DawmingGeometry {

    public static void Triangle(int input) {
        switch (input) {
            case 1:
                System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-right");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j >= 1; j--) {
                        if (j > 6 - i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("In hình tam giác vuông, có cạnh góc vuông ở bottom-right");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (j <= 5 - i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
        }
    }

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Bạn muốn chọn vẽ hình nào ?");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ hình tam giác vuông");
            System.out.println("3. Vẽ hình tam giác cân");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("Vẽ hình tam giác");
                    System.out.println("1. In hình tam giác vuông, có cạnh góc vuông ở top-left");
                    System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở top-right");
                    System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở bottom-left");
                    System.out.println("4. In hình tam giác vuông, có cạnh góc vuông ở bottom-right");
                    choice = input.nextInt();
                    Triangle(choice);
                    break;
                case 3:
                    System.out.println("Vẽ tam giác cân");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.printf("%4s", "*");
                        }
                        System.out.println();

                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Hãy lựa chọn lại");
            }
        }
    }
}