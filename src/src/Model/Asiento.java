package Model;

import Enums.EstadoAsiento;

public class Asiento {
    public int codigoAsiento;
    public String fila;
    public int numero;
    public EstadoAsiento estadoAsiento;

    public Asiento(int codigoAsiento, String fila, int numero, EstadoAsiento estadoAsiento) {
        this.codigoAsiento = codigoAsiento;
        this.fila = fila;
        this.numero = numero;
        this.estadoAsiento = estadoAsiento;
    }

    public int getCodigoAsiento() {
        return codigoAsiento;
    }

    public void setCodigoAsiento(int codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public EstadoAsiento getEstadoAsiento() {
        return estadoAsiento;
    }

    public void setEstadoAsiento(EstadoAsiento estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }

    @Override
    public String toString() {
        return "Model.Asiento{" +
                "codigoAsiento=" + codigoAsiento +
                ", fila=" + fila +
                ", numero=" + numero +
                ", estadoAsiento=" + estadoAsiento +
                '}';
    }
}
