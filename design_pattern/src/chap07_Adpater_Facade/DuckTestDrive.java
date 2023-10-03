package chap07_Adpater_Facade;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println(">칠면조 Start");
        turkey.gobble();
        turkey.fly();
        System.out.println("\n");

        System.out.println(">오리 Start");
        testDuck(duck);
        System.out.println("\n");

        System.out.println(">칠면조 어댑터 Start");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
