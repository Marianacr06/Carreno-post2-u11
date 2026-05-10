package com.empresa.pedidos.envio;

import com.empresa.pedidos.dominio.Pedido;
import org.springframework.stereotype.Component;

@Component("GRATIS")
public class EnvioGratis implements EstrategiaEnvio {
    @Override
    public double calcularCosto(Pedido pedido) {
        return 0.0;
    }
}
