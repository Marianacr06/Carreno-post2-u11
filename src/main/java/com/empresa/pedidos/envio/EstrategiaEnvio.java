package com.empresa.pedidos.envio;

import com.empresa.pedidos.dominio.Pedido;

public interface EstrategiaEnvio {
    double calcularCosto(Pedido pedido);
}
