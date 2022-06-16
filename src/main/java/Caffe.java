import java.util.ArrayList;
import java.util.List;

public class Caffe implements Servise {
    private List<String> foods = new ArrayList<>();

    public Caffe(){
        foods.add("Мороженое");
        foods.add("Кофе");
        foods.add("Блинчики");
        foods.add("Чай");
        foods.add("Салат");

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
