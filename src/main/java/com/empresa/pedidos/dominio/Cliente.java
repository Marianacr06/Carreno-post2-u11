package com.empresa.pedidos.dominio;

package com.empresa.pedidos.dominio;

public class Cliente {
    private boolean activo;
    private int score;
    private double limiteCredito;

    public boolean isActivo() { return activo; }
    public int getScore() { return score; }
    public double getLimiteCredito() { return limiteCredito; }
    public void setActivo(boolean activo) { this.activo = activo; }
    public void setScore(int score) { this.score = score; }
    public void setLimiteCredito(double limiteCredito) { this.limiteCredito = limiteCredito; }
}
