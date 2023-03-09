public class Pizza {
    // Atributos
    private String tamaño;
    private String tipo;
    private String estado;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    // Constructor
    public Pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        totalPedidas++;
    }

    // Métodos
    public void sirve() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            totalServidas++;
        } else {
            System.out.println("Esa pizza ya se ha servido");
        }
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    // Getters y setters
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pizza " + getTamaño() + " " + getTipo() + ", " + getEstado();
    }
}
