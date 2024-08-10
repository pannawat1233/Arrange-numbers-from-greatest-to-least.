/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author PC
 */
public class Mavenproject8 {

    public static void main(String[] args) {
       Integer[] list = new Integer[5];
       for(int i = 0; i<5; i++)
       {
           System.out.println("Enther or number"+i);
           Scanner input = new Scanner(System.in);
           list[i] = input.nextInt();     
       }
       Arrays.sort(list,Collections.reverseOrder());
       for (int number : list)
       {
            System.out.println("_________________________________");
            System.out.println(number);
       }
    }
}
