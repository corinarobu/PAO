package animal;

public class Ape extends Animal{
  private String size;

  public Ape(int noOfLegs, String name, String size){
      super(name,noOfLegs);
      this.size = size;
  }

}
