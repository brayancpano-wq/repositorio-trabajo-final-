public class Venta {
    public String codigo;
    public String fecha;
    public String hora;
    public double valorPagado;
    public EstadoVenta estadoVenta;

    public Venta(String codigo, String fecha, String hora, double valorPagado, EstadoVenta estadoVenta) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.valorPagado = valorPagado;
        this.estadoVenta = estadoVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
    }

    public EstadoVenta getEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(EstadoVenta estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "codigo='" + codigo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", valorPagado=" + valorPagado +
                ", estadoVenta=" + estadoVenta +
                '}';
    }
}
