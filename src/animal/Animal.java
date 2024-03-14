package animal;

public class Animal {
     private String name;
     private int noOfLegs;

     public Animal(){

     }

    public Animal(String name, int noOfLegs){
        this.name = name;
        this.noOfLegs = noOfLegs;
    }

    public void move(){
        System.out.println("I can move");
    }

    public void eat(){
        System.out.println("I need something to eat");
    }

    public void eat(String food){
        System.out.println("I can eat " + food);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}
