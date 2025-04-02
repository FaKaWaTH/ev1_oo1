package Code;

public class Usuario {
    int id;
    
    String nombre;
    String correo;
    
    boolean mayorEdad;

    public Usuario() {}
    
    public void registrar(int id, String nombre) {
        
        this.nombre = nombre;
    }
    
    public void registrar(int id, String nombre, String correo) {
        
        this.nombre = nombre;
        this.correo = correo;
    }
    
    public void registrar(int id, String nombre, String correo, boolean mayorEdad) {
        
        this.nombre = nombre;
        this.correo = correo;
        this.mayorEdad = mayorEdad;
    }
    
}
