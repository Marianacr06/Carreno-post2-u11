# Patrones de Diseno de Software - U11 Post 2

## Objetivo
Refactorizar condicionales complejos usando Replace Conditional with Polymorphism y Guard Clauses. Verificar reduccion de CC y Quality Gate en SonarQube.

## Estructura
- src/
- img/ (capturas)

## Refactorizaciones
- `calcularEnvio` usa Strategy con implementaciones por tipo.
- `aprobarCredito` usa guard clauses.
- Pruebas creadas antes de refactorizar.

## Ejecucion
```bash
mvn test
mvn verify sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.token=TU_TOKEN
```

## Tabla comparativa (completar)
| Metodo | CC antes | CC despues |
| --- | --- | --- |
| calcularEnvio | | |
| aprobarCredito | | |

## Evidencias
- img/sonarqube-antes.png
- img/sonarqube-despues.png
- img/quality-gate.png

## Reflexion
Agregar un nuevo tipo de envio solo requiere crear una nueva clase que implemente `EstrategiaEnvio` sin modificar `EnvioService`, cumpliendo OCP.
