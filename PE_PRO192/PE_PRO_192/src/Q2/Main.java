/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double price;
        int series;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter price: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter series: ");
        series = Integer.parseInt(sc.nextLine());
        System.out.println("1.Test toString()");
        System.out.println("2 Test getSalePrice()");
        System.out.print("Enter TC (1 or 2):");
        VNCar newCar = new VNCar(name, price, series);
        int choise = Integer.parseInt(sc.nextLine());
        if (choise == 1) {
            System.out.println("OUT PUT:");
            System.out.println(newCar);
        } else if (choise == 2) {
            System.out.println(newCar.getSalePrice());
        }
    }
}
