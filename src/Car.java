public class Car {


    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year =2021;

// overriding the toString() method to get text:

    public String toString() {

        // instead of: String myString = make + "\n"+model+ "\n"+color+ "\n"+year;
        return make + "\n"+model+ "\n"+color+ "\n"+year;
    }

}
