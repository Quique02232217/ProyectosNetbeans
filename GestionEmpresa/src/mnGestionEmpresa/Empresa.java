package mnGestionEmpresa;

public class Empresa {

    int Calle, Numero, Codigo_Postal;
    String Localidad, Provincia;

    public Empresa(int Calle, int Numero, int Codigo_Postal, String Localidad, String Provincia) {
        this.Calle = Calle;
        this.Codigo_Postal = Codigo_Postal;
        this.Localidad = Localidad;
        this.Numero = Numero;
        this.Provincia = Provincia;

    }
    
    public int getCalle(){
        return Calle;
    }

    public int getNumero() {
        return Numero;
    }

    public int getCodigo_Postal() {
        return Codigo_Postal;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public String getProvincia() {
        return Provincia;
    }

}
