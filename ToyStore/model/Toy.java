package model;

public class Toy {
    int id;
    String name;
    int quantity;
    int weight;

    public String info() {
        return "Toy.info : " +
                "id = " + this.getId() +
                " name = " + this.getName() +
                " quantity = " + this.getQuantity() +
                " weight " + this.getWeight();
    }


    
}
