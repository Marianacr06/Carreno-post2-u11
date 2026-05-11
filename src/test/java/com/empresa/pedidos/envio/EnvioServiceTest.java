package com.empresa.pedidos.envio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.empresa.pedidos.dominio.Pedido;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class EnvioServiceTest {
    @Test
    void calcularEnvio_estandar_con_total_alto_es_gratis() {
        Pedido pedido = new Pedido();
        pedido.setTotal(60.0);

        Map<String, EstrategiaEnvio> estrategias = new HashMap<>();
        estrategias.put("ESTANDAR", new EnvioEstandar());

        EnvioService service = new EnvioService(estrategias);

        assertEquals(0.0, service.calcularEnvio(pedido, "ESTANDAR"), 0.001);
    }
}
