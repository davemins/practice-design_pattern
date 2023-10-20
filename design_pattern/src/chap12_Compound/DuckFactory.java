package chap12_Compound;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
}
