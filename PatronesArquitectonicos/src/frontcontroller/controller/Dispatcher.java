package frontcontroller.controller;

import frontcontroller.view.ErrorView;
import frontcontroller.view.HomeView;

public class Dispatcher {
    public void dispatch(String request) {
        if (request.equalsIgnoreCase("home")) {
            new HomeView().mostrar();
        } else {
            new ErrorView().mostrar();
        }
    }
}