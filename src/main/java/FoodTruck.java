import java.util.ArrayList;

public class FoodTruck implements Servise{
    ArrayList<String> foods = new ArrayList<>();
    public FoodTruck(){
        foods.add("Крылышки гриль");
        foods.add("Хот-дог");
        foods.add("Гамбургер");
        foods.add("Картофель фри");
        foods.add("Газировка");

    }
    public String cook(String name) {
        for (int i=0; i<foods.size();i++){
            String foodName = foods.get(i);
            if (foodName.equals(name)){
                return name;
            }
        }
        return "Блюдо не найдено";
    }

    public void sale(Integer cost) {

    }

}
