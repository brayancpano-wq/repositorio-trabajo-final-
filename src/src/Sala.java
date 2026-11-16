import java.util.ArrayList;
import java.util.List;

public class Sala {

    // --- ATRIBUTOS ---
    private String codigo
    private String nombre;
    private int capacidadMaxima;
    private EstadoSala estadoSala;
    private List<Asiento> listSalaAsientos;

    /**
     * Método constructor de la clase sala
     * Los asientos se construyen con orden A1, A2, A3, B1, B2. etc
     *
     * @param codigo Código único de la sala.
     * @param nombre Nombre de la sala.
     * @param filas Número de filas (de 1 a 26 para que coincida con el abecedario).
     * @param asientosPorFila Cantidad de asientos en cada fila.
     * @param estadoSala Estado inicial de la sala (DISPONIBLE o FUERA_DE_SERVICIO).
     */
    public Sala(String codigo, String nombre, int filas, int asientosPorFila, EstadoSala estadoSala) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estadoSala = estadoSala;
        this.capacidadMaxima = filas * asientosPorFila; // Se calcula automático
        this.listSalaAsientos = new ArrayList<>();

        // Lógica del profesor para generar asientos: Fila A, B, C...
        for (int i = 0; i < filas; i++) {
            // Convierte el número 0, 1, 2... en letra 'A', 'B', 'C'...
            String fila = String.valueOf((char) ('A' + i));

            for (int j = 1; j <= asientosPorFila; j++) {
                // Se asume que el Asiento recibe (filaLetra, numero, estado)
                listSalaAsientos.add(new Asiento(fila, j, EstadoAsiento.DISPONIBLE,));
            }
        }
    }

    /**
     * Método que permite buscar un asiento específico.
     * @param fila Fila solicitada (Ej: "A").
     * @param numero Número solicitado (Ej: 3).
     * @return Asiento encontrado o null si no existe.
     */
    public Asiento buscarAsiento(String fila, int numero) {
        Asiento encontrado = null;
        if (fila != null) {
            for (Asiento asiento : listSalaAsientos) {
                if (asiento.getFila().equalsIgnoreCase(fila.trim()) && asiento.getNumero() == numero) {
                    encontrado = asiento;
                }
            }
        }
        return encontrado;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public EstadoSala getEstadoSala() {
        return estadoSala;
    }

    public void setEstadoSala(EstadoSala estadoSala) {
        this.estadoSala = estadoSala;
    }

    public List<Asiento> getListSalaAsientos() {
        return listSalaAsientos;
    }

    public void setListSalaAsientos(List<Asiento> listSalaAsientos) {
        this.listSalaAsientos = listSalaAsientos;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", capacidadMaxima=" + capacidadMaxima +
                ", estadoSala=" + estadoSala +
                ", listSalaAsientos=" + listSalaAsientos +
                '}';
    }
}