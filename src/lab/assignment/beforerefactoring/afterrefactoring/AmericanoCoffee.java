package lab.assignment.afterrefactoring;

// Just the americano coffee class
public class AmericanoCoffee extends CoffeeTemplate {

    @Override
    protected void addIngredients() {
        System.out.println("Add more hot water");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Add sugar and cream");
    }
}
