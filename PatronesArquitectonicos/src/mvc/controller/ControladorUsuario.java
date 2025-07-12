package mvc.controller;

import mvc.model.Usuario;
import mvc.view.VistaUsuario;

public class ControladorUsuario {
    private Usuario modelo;
    private VistaUsuario vista;

    public ControladorUsuario(Usuario modelo, VistaUsuario vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setNombreUsuario(String nombre) {
        modelo.setNombre(nombre);
    }

    public void actualizarVista() {
        vista.mostrarUsuario(modelo.getNombre());
    }
}
