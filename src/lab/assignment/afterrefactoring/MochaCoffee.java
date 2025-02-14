package lab.assignment.afterrefactoring;

// Just the mocha coffee class
public class MochaCoffee extends CoffeeTemplate {

    @Override
    protected void addIngredients() {
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Adding sugar");
    }
}
