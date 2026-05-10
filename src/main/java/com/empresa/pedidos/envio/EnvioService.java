package com.empresa.pedidos.envio;

import com.empresa.pedidos.dominio.Pedido;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class EnvioService {
    private final Map<String, EstrategiaEnvio> estrategias;

    public EnvioService(Map<String, EstrategiaEnvio> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcularEnvio(Pedido pedido, String tipo) {
        return Optional.ofNullable(estrategias.get(tipo))
            .orElseThrow(() -> new IllegalArgumentException("Tipo de envio desconocido: " + tipo))
            .calcularCosto(pedido);
    }
}
