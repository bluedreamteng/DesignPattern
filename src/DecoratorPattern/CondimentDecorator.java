package DecoratorPattern;

public abstract class CondimentDecorator extends Beverage{
    private Beverage beverage;


    @Override
    public abstract String getDescription();

}
