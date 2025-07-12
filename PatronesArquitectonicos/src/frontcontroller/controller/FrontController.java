package frontcontroller.controller;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean autenticarUsuario() {
        System.out.println("Autenticando usuario...");
        return true;
    }

    public void manejarSolicitud(String request) {
        if (autenticarUsuario()) {
            dispatcher.dispatch(request);
        }
    }
}
