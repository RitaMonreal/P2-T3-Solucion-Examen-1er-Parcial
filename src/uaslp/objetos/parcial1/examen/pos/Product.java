package uaslp.objetos.parcial1.examen.pos;

public class Product {
    //Atributos
    private String name;
    private float amount;

    //Métodos
    public Product(String name, float amount){//Constructor
        this.name = name;
        this.amount = amount;
    }

    public String getName(){
        return name;
    }

    public float getAmount(){
        return amount;
    }
}
