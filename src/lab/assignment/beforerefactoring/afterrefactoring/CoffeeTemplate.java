package lab.assignment.afterrefactoring;

public abstract class CoffeeTemplate {

    // Template method defining the algorithm skeleton
    public final void prepareCoffee() {
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        serve();
    }

    // Common steps with fixed implementations
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    private void serve() {
        System.out.println(">>Serving coffee");
    }

    // Hook methods to be overridden by subclasses
    protected abstract void addIngredients();
    protected abstract void finalTouch();
}
