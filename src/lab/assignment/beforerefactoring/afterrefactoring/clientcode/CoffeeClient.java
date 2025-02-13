package lab.assignment.afterrefactoring.clientcode;

// Importing the classes from the above package
import lab.assignment.afterrefactoring.MochaCoffee;
import lab.assignment.afterrefactoring.CappuccinoCoffee;
import lab.assignment.afterrefactoring.AmericanoCoffee;
import lab.assignment.afterrefactoring.CoffeeTemplate;

public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeTemplate coffee;
        
        // Prepare Mocha 
        coffee = new MochaCoffee();
        coffee.prepareCoffee();
        System.out.println("********************");
        
        // Prepare Cappuccino 
        coffee = new CappuccinoCoffee();
        coffee.prepareCoffee();
        System.out.println("********************");
        
        // Prepare Americano 
        coffee = new AmericanoCoffee();
        coffee.prepareCoffee();
    }
}
