import java.util.ArrayList;

public class Bar implements Servise {
    ArrayList<String> foods = new ArrayList<>();
    public Bar(){
        foods.add("Виски");
        foods.add("Пиво");
        foods.add("Водка");
        foods.add("Вино");
        foods.add("Коктейль");
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
