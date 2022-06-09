import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Servise caffe = new Caffe();
        caffe.cook("asd");
        caffe.sale(100);

        Servise bar = new Bar();
        bar.sale(200);
        bar.cook("trf");

        Servise foodTruck = new FoodTruck();
        foodTruck.cook("ygf");
        foodTruck.sale(150);

        ArrayList<Servise> serv = new ArrayList<>();
        serv.add(caffe);
        serv.add(bar);
        serv.add(foodTruck);
    }
}
