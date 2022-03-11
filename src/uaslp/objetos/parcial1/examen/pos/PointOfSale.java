package uaslp.objetos.parcial1.examen.pos;

import java.util.ArrayList;

public class PointOfSale {
    //Atributos
    private ArrayList<CartItem> items;

    //Métodos
    public PointOfSale(){
        items = new ArrayList<>();
    }

    public void addToCart(int quantity, Product product){//Este método es para que cada que introduzca un nuevo producto busque si ya existia, para irlos sumando

        for(CartItem item: items){
            if(item.getProductName().equals((product.getName()))){//Compara los nombres
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        CartItem cartItem = new CartItem();//Si no existe lo creo
        cartItem.setQuantity(quantity);
        cartItem.setProduct(product);

        items.add(cartItem);
    }

    public float getTotal(){//Nos dice cuál va a ser el total
        float total = 0;
        for(CartItem item: items){//Recorre nuestros productos
            total += item.getAmount() * item.getQuantity();//Multiplica los precios por la cantidad de promedio
        }
        return total;
    }

    public ArrayList<CartItem>getProducts(){
        return items;
    }

    public int getCountByName(String name){
        for(CartItem item: items){
            if(item.getProductName().equals(name)){
                return item.getQuantity();
            }
        }
        return 0;
    }
}
