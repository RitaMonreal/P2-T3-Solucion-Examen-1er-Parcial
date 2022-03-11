package uaslp.objetos.parcial1.examen;

import uaslp.objetos.parcial1.examen.pos.CartItem;
import uaslp.objetos.parcial1.examen.pos.PointOfSale;
import uaslp.objetos.parcial1.examen.pos.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PointOfSale pointOfSale = new PointOfSale();

        pointOfSale.addToCart(2, new Product("Sabritas", 20.5f)); //Se añaden 2 productos Sabritas de $20.50 c/u
        pointOfSale.addToCart(1, new Product("Jumex Mango", 15)); //Se añade 1 producto Jumex Mango de $15 c/u
        pointOfSale.addToCart(4, new Product("Chetos", 18.3f)); //Se añaden 4 productos Chetos de $18.3 c/u
        pointOfSale.addToCart(3, new Product("Coca", 24.9f)); //Se añaden 3 productos Coca de $24.9 c/u
        pointOfSale.addToCart(2, new Product("Chetos", 18.3f)); //Se añaden 2 productos Chetos de $18.3 c/u

        ArrayList<CartItem> products = pointOfSale.getProducts();

        System.out.println("Productos a vender:");

        //Iterador
        for (CartItem cartItem : products) {
            System.out.println(cartItem.getQuantity() + " - " + cartItem.getProductName() + " - $ " + (cartItem.getAmount() * cartItem.getQuantity()));
        }

        System.out.println();
        System.out.println("El total de venta es: $ " + pointOfSale.getTotal());
        System.out.println();

        String[] productNames = {"Sabritas", "Jumex Mango", "Chetos", "Coca"};//Nomenclatura para inicializar un arreglo

        for (String name : productNames) {
            System.out.println("Se vendieron " + pointOfSale.getCountByName(name) + " " + name);
        }
    }
}
