/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pascaltriangle;

import java.util.Scanner;

/**
 *
 * @author Nhat Anh
 */
public class PascalTriangle {

    //tính giai thừa bằng đệ quy
    public static int factorial(int n) {
        //nếu n = 0 thì 0! = 1
        if (n == 0) {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
    //hàm vẽ tam giác pascal
    public static void drawPascalTriangle(int numberOfRow) {
        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(i)/(factorial(j)*factorial(i-j)));
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //dọc input
        System.out.print("Enter row: ");
        int number = sc.nextInt();
        drawPascalTriangle(number);

    }
}
