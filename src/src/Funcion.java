public class Funcion {
    public int codigo;
    public String fecha;
    public String hora;
    public double precioBase;
    public EstadoFuncion estadoFuncion;

    public Funcion(String fecha, int codigo, String hora, double precioBase, EstadoFuncion estadoFuncion) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.hora = hora;
        this.precioBase = precioBase;
        this.estadoFuncion = estadoFuncion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public EstadoFuncion getEstadoFuncion() {
        return estadoFuncion;
    }

    public void setEstadoFuncion(EstadoFuncion estadoFuncion) {
        this.estadoFuncion = estadoFuncion;
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "codigo=" + codigo +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", precioBase=" + precioBase +
                ", estadoFuncion=" + estadoFuncion +
                '}';
    }
}
