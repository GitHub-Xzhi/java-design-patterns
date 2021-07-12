package org.xzhi.af.store.impl;

import org.xzhi.af.factory.PizzaIngredientFactory;
import org.xzhi.af.factory.impl.NYPizzaIngredientFactory;
import org.xzhi.af.pizza.Pizza;
import org.xzhi.af.pizza.impl.CheesePizza;
import org.xzhi.af.pizza.impl.VeggiePizza;
import org.xzhi.af.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        }
        return pizza;
    }
}
