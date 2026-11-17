package Model;

import Enums.EstadoVenta;
import java.util.ArrayList;
import java.util.Objects;

public class Venta {
    public String codigo;
    public String fecha;
    public String hora;
    public double valorPagado;
    public EstadoVenta estadoVenta;
    public ArrayList<Asiento> asientos = new ArrayList<>();
    public ArrayList<Boleta> boletas = new ArrayList<>();



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

    public ArrayList<Asiento> getAsientos() {
        return new ArrayList<>(asientos);
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos == null ? new ArrayList<>() : new ArrayList<>(asientos);
    }

    public ArrayList<Boleta> getBoletas() {
        return new ArrayList<>(boletas);
    }

    public void setBoletas(ArrayList<Boleta> boletas) {
        this.boletas = boletas == null ? new ArrayList<>() : new ArrayList<>(boletas);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta venta = (Venta) object;
        return Objects.equals(codigo, venta.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }


    @Override
    public String toString() {
        return "Model.Venta{" +
                "codigo='" + codigo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", valorPagado=" + valorPagado +
                ", estadoVenta=" + estadoVenta +
                '}';
    }
}
