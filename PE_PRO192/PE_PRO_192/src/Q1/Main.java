/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code;
        double price;
        int choise;
        System.out.print("Enter code: ");
        code = sc.nextLine();
        System.out.print("Enter price: ");
        price = Double.parseDouble(sc.nextLine());
        Fan newFan = new Fan(code, price);
        System.out.println("1. Test getCode()");
        System.out.println("2. Test setPrice()");
        System.out.print("Enter TC (1 or 2): ");
        choise = Integer.parseInt(sc.nextLine());
        switch (choise) {
            case 1:
                System.out.println("OUT PUT:\n" + newFan.getCode());
                break;
            case 2:
                System.out.print("Enter new pirce: ");
                newFan.setPrice(Double.parseDouble(sc.nextLine()));
                System.out.println("OUT PUT:\n" + newFan.getPrice());
                break;
        }
    }
}
