public class Asiento {
    public int codigoAsiento;
    public int fila;
    public int numero;
    public EstadoAsiento estadoAsiento;

    public Asiento(int codigoAsiento, int fila, int numero, EstadoAsiento estadoAsiento) {
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

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
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
        return "Asiento{" +
                "codigoAsiento=" + codigoAsiento +
                ", fila=" + fila +
                ", numero=" + numero +
                ", estadoAsiento=" + estadoAsiento +
                '}';
    }
}
