package chap04_Factory;

public class NYStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza((ingredientFactory));
            pizza.setName("뉴욕 스타일 치즈 피자");
        }

        return pizza;
    }
}
