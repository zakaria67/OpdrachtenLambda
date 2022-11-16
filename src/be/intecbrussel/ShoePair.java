package be.intecbrussel;

import java.util.stream.Stream;

public class ShoePair {
    private String brand;
    private boolean complete;
    private String colour;
    private int size;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoePair{" +
                "brand='" + brand + '\'' +
                ", complete=" + complete +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public ShoePair(String brand, boolean complete, String colour, int size, double price) {
        this.brand = brand;
        this.complete = complete;
        this.colour = colour;
        this.size = size;
        this.price = price;



    }

    public static void main(String[] args) {
        ShoePair nike = new ShoePair("Nike",false,"white", 41, 69.99);
        ShoePair timberLand = new ShoePair("TimberLand",true,"brown", 41, 219.99);
        ShoePair balenciaga = new ShoePair("Balenciaga",true,"black", 45, 429.99);
        ShoePair nike2 = new ShoePair("Nike",true,"white", 42,29.99);
        ShoePair timberLand2 = new ShoePair("TimberLand",true,"black", 39, 170);
        ShoePair balenciaga2 = new ShoePair("Balenciaga",false,"black", 45, 50);
        ShoePair nike3 = new ShoePair("Nike",true,"white", 41, 79.99);
        ShoePair timberLand3 = new ShoePair("TimberLand",true,"yellow", 41, 80);
        ShoePair balenciaga3 = new ShoePair("Balenciaga",false,"black", 37, 349.99);

        ShoePair [] shoePairs = {nike,timberLand,balenciaga,nike2,timberLand2,balenciaga2,nike3,timberLand3,balenciaga3};
        /*for (int i=0; i <shoePairs.length;i++){
            if (shoePairs[i].getSize()==41 && shoePairs[i].isComplete())
                System.out.println(shoePairs[i]);
        }*/

        Stream.of(shoePairs)
                .filter(shoePair ->shoePair.getSize()==41  )
                .filter(ShoePair::isComplete)
                .forEach(System.out::println);
    }
}
