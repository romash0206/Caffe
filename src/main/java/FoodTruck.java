import java.util.ArrayList;
import java.util.List;

public class FoodTruck implements Servise{

    public FoodTruck(){
        foods.add("Крылышки гриль");
        foods.add("Хот-дог");
        foods.add("Гамбургер");
        foods.add("Картофель фри");
        foods.add("Газировка");

    }
    public String cook(String name) {
        if(foods.contains(name)){
            return name;
        }

        return "Блюдо не найдено";

    }

    public void sale(Integer cost) {

    }

}
