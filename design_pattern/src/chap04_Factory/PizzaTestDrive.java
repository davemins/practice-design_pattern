package chap04_Factory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStrore = new NYStylePizzaStore();

        Pizza pizza = nyStrore.orderPizza("cheese");
        System.out.println("\n" + "민석님이 주문하신 피자가 나왔습니다. \n" + pizza);
    }
}
