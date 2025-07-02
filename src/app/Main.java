package app;

import controller.InventarioController;
import view.InventarioView;

public class Main {
    public static void main(String[] args) {
        InventarioController controller = new InventarioController();
        InventarioView view = new InventarioView(controller);
        view.iniciar();
    }
}
