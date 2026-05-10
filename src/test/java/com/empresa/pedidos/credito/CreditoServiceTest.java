package com.empresa.pedidos.credito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.empresa.pedidos.dominio.Cliente;
import org.junit.jupiter.api.Test;

class CreditoServiceTest {
    @Test
    void aprobarCredito_cliente_nulo_rechaza() {
        CreditoService service = new CreditoService();

        assertEquals("RECHAZADO", service.aprobarCredito(null, 1000));
    }

    @Test
    void aprobarCredito_cliente_valido_aprueba() {
        Cliente cliente = new Cliente();
        cliente.setActivo(true);
        cliente.setScore(700);
        cliente.setLimiteCredito(2000);

        CreditoService service = new CreditoService();

        assertEquals("APROBADO", service.aprobarCredito(cliente, 500));
    }
}
