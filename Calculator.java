public class Calculator {
    public static void main(String[] args) {
        logic logic = new logic();
        UI ui = new UI(logic);
        ui.show();
    }
}