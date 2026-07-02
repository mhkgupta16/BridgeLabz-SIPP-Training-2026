public class Fruit {

    static void display(Box<? extends Fruit> box) {

        Fruit f = box.getItem();
        f.show();
    }

    public static void main(String[] args) {

        Box<Apple> appleBox =
                new Box<>(new Apple());

        Box<Banana> bananaBox =
                new Box<>(new Banana());

        display(appleBox);
        display(bananaBox);
    }
}