package microservices.gateway;

import microservices.services.PedidoService;
import microservices.services.UsuarioService;

public class ApiGateway {
	private UsuarioService usuarioService;
    private PedidoService pedidoService;

    public ApiGateway() {
        usuarioService = new UsuarioService();
        pedidoService = new PedidoService();
    }

    public void procesarSolicitud(String tipo, int id) {
        if (tipo.equals("usuario")) {
            System.out.println(usuarioService.getUsuario(id));
        } else if (tipo.equals("pedido")) {
            System.out.println(pedidoService.getPedido(id));
        }
    }
}
