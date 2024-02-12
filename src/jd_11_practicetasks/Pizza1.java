package jd_11_practicetasks;

public class Pizza1 {
    public String size;
    public int numOfCheeseTopping;
    public int numOfPepperoniTopping;

    public Pizza1(String size, int numOfCheeseTopping, int numOfPepperoniTopping) {
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfPepperoniTopping = numOfPepperoniTopping;
    }

    public static double calcCost(String size, int numOfCheeseTopping,int numOfPepperoniTopping){
      int sizeCost =(size.equalsIgnoreCase("small"))?10:(size.equalsIgnoreCase("medium"))?12 : 14 ;
      double cost = sizeCost + numOfCheeseTopping*2 + numOfPepperoniTopping*2 ;
      return cost;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numOfCheeseTopping=" + numOfCheeseTopping +
                ", numOfPepperoniTopping=" + numOfPepperoniTopping +
                ", Cost of pizza =" + calcCost(size,numOfCheeseTopping,numOfPepperoniTopping)+
                '}';
    }
}
