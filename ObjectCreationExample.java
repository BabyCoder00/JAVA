class MyClass {
    void showMessage() {
        System.out.println("Hello! Object Created Successfully.");
    }
}

public class ObjectCreationExample {
    public static void main(String[] args) {
        try {
            MyClass obj1 = new MyClass();
            obj1.showMessage();

            MyClass obj2 = MyClass.class.getDeclaredConstructor().newInstance();
            obj2.showMessage();

        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
