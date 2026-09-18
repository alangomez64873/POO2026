package Talleres.Taller01;

public class TestProduct {
    public static void main(String[] args) {

        var realPrice = new Product();
        var realStock = new Product();
        var realName = new Product();

        if (realName.setName("charger") == true) {
            System.out.println("The name is correct");
        } else {
            System.out.println("The product must have a name");
        }

        if (realStock.setStock(8) == true) {
            System.out.println("The amount is correct");
        } else {
            System.out.println("The product must have an amount");
        }

        if (realPrice.setPrice(1.56) == true) {
            System.out.println("The price is correct");
        } else {
            System.out.println("The product must have a price");
        }

    }
}