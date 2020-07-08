/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class Main {

    static void addFan(List<Fan> t) {
        Scanner sc = new Scanner(System.in);
        String code;
        double price;
        System.out.print("Enter code: ");
        code = sc.nextLine();
        System.out.print("Enter price: ");
        price = Double.parseDouble(sc.nextLine());
        t.add(new Fan(code, price));
    }

    static void displayList(List<Fan> t, int tc) {
        if (tc == 1) {
            System.out.println("f1: ");
        } else if (tc == 2) {
            System.out.println("f2: ");
        } else if (tc == 3) {
            System.out.println("f3: ");
        }
        for (Fan e : t) {
            System.out.println(e.getCode() + "\t" + e.getPrice());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Fan> t = new ArrayList<>();
        MyFan myfan = new MyFan();
        t.add(new Fan("FS21", 80));
        t.add(new Fan("KS20", 60));
        t.add(new Fan("FF12", 70));

        System.out.print("Add how many fans: ");
        int fans = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < fans; i++) {
            addFan(t);
        }
        System.out.print("Enter TC (1-f1; 2-f2; 3-f3): ");
        int tc = Integer.parseInt(sc.nextLine());
        System.out.print("The list before running list ");
        displayList(t, tc);
        switch (tc) {
            case 1:
                System.out.print("Enter xCode: ");
                String xCode = sc.nextLine();
                myfan.f1(t, xCode);
                break;
            case 2:
                System.out.print("Enter xPrice: ");
                double xPrice = Double.parseDouble(sc.nextLine());
                System.out.println(myfan.f2(t, xPrice));
                break;
            case 3:
                myfan.f3(t);
                break;
        }
    }
}
