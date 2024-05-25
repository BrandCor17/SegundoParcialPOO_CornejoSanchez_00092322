public class Electronico extends Producto{
private String NombreElectronico;
    public Electronico(String nombre, double precio, String nombreElectronico) {
        super(nombre, precio);
        this.NombreElectronico = nombreElectronico;
    }

    public String getNombreElectronico() {
        return NombreElectronico;
    }

    public void setNombreElectronico(String nombreElectronico) {
        NombreElectronico = nombreElectronico;
    }
}
