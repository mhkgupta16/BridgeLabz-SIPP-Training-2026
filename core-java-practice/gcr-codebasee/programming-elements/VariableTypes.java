public class VariableTypes {

    static int x;
    int y;

    void m1() {
        System.out.println(x);
    }

    static void m2() {
        System.out.println(x);
    }

    public static void main(String[] args) {

        int x = 10;

        System.out.println(x);

        VariableTypes obj = new VariableTypes();

        System.out.println(obj.x);

        obj.m1();

        obj.m2();
    }
}



