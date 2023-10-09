package mnUsuario;


public class Atributos {
     String nombre, apellido, equipo;
     int cedula, edad;
    
    
    
    public Atributos(String nombre, String apellido, String equipo,int cedula, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.equipo = equipo;
        
        }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }
    
    

    public void mostrarDatos(){
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDO: "+apellido);
        System.out.println("CEDULA: "+cedula);
        System.out.println("EDAD: "+edad);
        System.out.println("EQUIPO: "+equipo);
    
    
    }
    
    
    }
