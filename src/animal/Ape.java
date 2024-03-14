package animal;


public class Ape extends Animal {

    private String size;



    public Ape(int noOfLegs, String name, String size) {
        super(name, noOfLegs); //call parent class constructor
        this.size = size;
    }


    /**
     * Suprascriere metoda (method overriding)
     */
    @Override
    public void move() {
        System.out.println("I can jump!");
    }

    @Override
    public void eat() {
        System.out.println("I need something to eat! -- ape");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}