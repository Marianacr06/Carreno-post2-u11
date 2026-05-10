package com.empresa.pedidos.envio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.empresa.pedidos.aplicacion.EnvioServiceSucio;
import com.empresa.pedidos.dominio.Pedido;
import org.junit.jupiter.api.Test;

class EnvioServiceTest {

    @Test
    void calcularEnvio_express_debe_ser_12_99() {
        Pedido pedido = new Pedido();
        pedido.setTotal(60.0);
        EnvioServiceSucio service = new EnvioServiceSucio();
        assertEquals(12.99, service.calcularEnvio(pedido, "EXPRESS"), 0.001);
    }

    @Test
    void aprobarCredito_clienteNulo_debeRechazar() {
        EnvioServiceSucio service = new EnvioServiceSucio();
        assertEquals("RECHAZADO", service.aprobarCredito(null, 1000));
    }
}
