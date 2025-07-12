package mvc;

import mvc.controller.ControladorUsuario;
import mvc.model.Usuario;
import mvc.view.VistaUsuario;

public class Main {
    public static void main(String[] args) {
        Usuario modelo = new Usuario();
        VistaUsuario vista = new VistaUsuario();
        ControladorUsuario controlador = new ControladorUsuario(modelo, vista);

        controlador.setNombreUsuario("Carlos");
        controlador.actualizarVista(); 
    }
}
