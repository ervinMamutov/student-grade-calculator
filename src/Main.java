public class Main {
    public static void main(String[] args) {
        UserInput scanner = new UserInput();
        App app = new App(scanner);

        app.run();

        scanner.scannerClose();
    }

}