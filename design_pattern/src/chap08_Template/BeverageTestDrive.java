package chap08_Template;

public class BeverageTestDrive {
    public static void main(String[] args) {

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("Making tea..");
        teaHook.prepareRecipe();

        System.out.println("Making coffee..");
        coffeeWithHook.prepareRecipe();
    }
}
