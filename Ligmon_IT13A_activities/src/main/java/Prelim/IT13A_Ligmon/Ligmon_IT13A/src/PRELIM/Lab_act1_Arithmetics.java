/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRELIM;

/**
 *
 * @author ACER
 */
public class Lab_act1_Arithmetics {
    public static void main (String[] args){
        int num1 = 10;
        int num2 = 4;
        int num3 = 6;
        
        int first =  num1 * num2 + num3;
        int second = (num1 - num2) % num3;
        int third = (num1 + num2 + num3) / 3;
        int fourth = (num1 * num3) - 4 * 4;
        
        
        System.out.println("10 * 4 + 6 =" + first);
        System.out.println("10 - 4) % 6 =" + second);
        System.out.println("10 + 4 + 6 / 3 = " + third);
        System.out.println("10 * 6) - 4 * 4 = " + fourth);
        
      
    }
}
