package chap12_Combining;

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
