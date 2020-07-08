/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author hoang
 */
public class MyFan implements IFan {

    @Override
    public void f1(List<Fan> t, String xCode) {
        for (Fan x : t) {
            if (0 == x.getCode().indexOf(xCode)) {
                double price = x.getPrice();
                price += price / 10;
                x.setPrice(price);
                System.out.println(x.getCode() + "\t" + x.getPrice());
            } else {
                System.out.println(x.getCode() + "\t" + x.getPrice());
            }
        }
    }

    @Override
    public int f2(List<Fan> t, double xPrice) {
        int fans = 0;
        for(Fan x : t){
            if(x.getPrice() <= xPrice){
                fans++;
            }
        }
        return fans;
    }

    @Override
    public void f3(List<Fan> t) {
        Collections.sort(t, new Comparator<Fan>() {
            @Override
            public int compare(Fan o1, Fan o2) {
                return String.valueOf(o1.getPrice()).compareTo(String.valueOf(o2.getPrice()));
            }
        });
        System.out.println("OUT PUT:");
        for(Fan x : t){
            System.out.println(x.getCode() + "\t" + x.getPrice());
        }

    }
}

 
