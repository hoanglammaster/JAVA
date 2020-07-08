/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class Main {
    static void mainScreen(){
        System.out.println("1) Test f1()");
        System.out.println("2) Test f2()");
        System.out.print("Enter TC (1 or 2): ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyString myString = new MyString();
        int tc;
        String str;
        mainScreen();
        tc = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        switch(tc){
            case 1: System.out.println("OUT PUT:");
                    System.out.println(myString.f1(str));
                    break;
            case 2: System.out.println("OUT PUT:");
                    System.out.println(myString.f2(str));
                    break;
        }
        
    }
    
}
