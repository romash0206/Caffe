import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Servise caffe = new Caffe();
        System.out.println(caffe.cook("Блинчики"));

        Servise bar = new Bar();
        System.out.println(bar.cook("Вода"));

        Servise foodTruck = new FoodTruck();
        System.out.println(foodTruck.cook("Кетчуп"));

        ArrayList<Servise> serv = new ArrayList<>();
        serv.add(caffe);
        serv.add(bar);
        serv.add(foodTruck);

    }
}
