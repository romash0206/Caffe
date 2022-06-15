import java.util.ArrayList;

public class Caffe implements Servise {

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
