public class Main {
    public static void main(String[] args) {
        UserInput scannner = new UserInput();
        App app = new App(scannner);

        app.run();

        scannner.scannerClose();
    }
}