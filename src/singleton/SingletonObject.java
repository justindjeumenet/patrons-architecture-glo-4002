package singleton;

public class SingletonObject {

    /**
     *  Just create only one and expose it to users
     * */
    private static SingletonObject instance = new SingletonObject();

    /**
     *  Make the constructor private so none users can call it
     * */
    private SingletonObject(){}

    /**
     * Provide the only way to get the same instance of this class each time
     * */
    public static SingletonObject getInstance() {
        return instance;
    }

    /**
     * Test this method to print Hello World with your name
     * */
    public void sayHelloWorld(String name){
        System.out.println("Hello World "+ name);
    }
}
