package frontcontroller;

import frontcontroller.controller.FrontController;

public class Main {
	public static void main(String[] args) {
        FrontController frontController = new FrontController();

        frontController.manejarSolicitud("home");   
        frontController.manejarSolicitud("invalid"); 
    }
}
