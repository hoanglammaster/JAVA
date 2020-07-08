/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author hoang
 */
public class VNCar extends Car {

    private int series;

    public VNCar() {
    }

    public VNCar(String name, double price, int series) {
        super(name, price);
        this.series = series;
    }

    public double getSalePrice() {
        if (series < 300) {
            double price1 = this.price;
            return price1 += price1 / 10;
        } else {
            return this.price;
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return this.name + " " + this.price + " " + this.series;
    }

}
