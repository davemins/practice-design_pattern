package chap12_Compound;

public class Quacklogist2 implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("꽥꽥학자2: " + duck + "가 방금 소리냈다.");
    }
}
