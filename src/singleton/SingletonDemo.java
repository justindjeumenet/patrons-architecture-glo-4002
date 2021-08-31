package singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        // We cannot do this: SingletonObject anObject = new SingletonObject() otherwise we will get an error

        // Get yje only instance we can get
        SingletonObject uniqueObject = SingletonObject.getInstance();

        // Print the Hello World
        uniqueObject.sayHelloWorld("Justin");
    }
}
