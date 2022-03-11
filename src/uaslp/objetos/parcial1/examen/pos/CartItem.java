package uaslp.objetos.parcial1.examen.pos;

public class CartItem {
    //Atributos
    private int quantity;
    private Product product;

    //Métodos
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProductName(){
        return product.getName();
    }

    public float getAmount(){
        return product.getAmount();
    }
}
