public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }

    private void start() {
        Animal dog = new Animal("Fuzzy the cutest dog", 4);
        System.out.println(dog);
    }
}
