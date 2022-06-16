import java.util.ArrayList;
import java.util.List;

public class Bar implements Servise {
    private List<String> foods = new ArrayList<>();
    public Bar(){
        foods.add("Виски");
        foods.add("Пиво");
        foods.add("Водка");
        foods.add("Вино");
        foods.add("Коктейль");
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
