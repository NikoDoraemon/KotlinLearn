package com.location.kotlindemo.classes;

public class CellphoneJava {

    String brand;
    double price;
    public CellphoneJava(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CellphoneJava) {
            CellphoneJava other = (CellphoneJava) obj;
            return other.brand.equals(brand) && other.price == price;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return brand.hashCode() + (int) price;
    }

    @Override
    public String toString() {
        return "Cellphone(brand=" + brand + ", price=" + price + ")";
    }
}
