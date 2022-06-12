import java.util.ArrayList;

public class Caffe implements Servise {
    ArrayList<String> foods = new ArrayList<>();
    public Caffe(){
        foods.add("Мороженое");
        foods.add("Кофе");
        foods.add("Блинчики");
        foods.add("Чай");
        foods.add("Салат");

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
