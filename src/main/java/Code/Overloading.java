package Code;

/**
 *
 * @author 
 *          Allan Carbonell
 *          Diego Llorens
 */
public class Overloading {

    public static void main(String[] args) {
        /*
        *   Demostrar la creación de multiples Usuarios con
        *   el método registrar()
        *
        *   Ejemplos
        *       registar(id,nombre)
        *       registar(id,nombre,correo)
        *       registar(id,nombre,correo,mayorEdad)
        *
        */
        
        Usuario felix = new Usuario();
        Usuario roberto = new Usuario();
        Usuario carmen = new Usuario();
        
        felix.registrar(1, "Felix");
        
        roberto.registrar(2, "Roberto", "robertoDeus@gmail.com");
        
        carmen.registrar(3, "Carmen", "carcitabellakha@gmail.com", false);
        
        Usuario[] objetos = {felix, roberto, carmen};
        
        for (int i = 0; i<objetos.length; i++)
        {
            System.out.println("ID: "+objetos[i].id +" Nombre: "+objetos[i].nombre +" Correo: "+ objetos[i].correo +" Mayor de edad: "+ objetos[i].mayorEdad+"\n");
        }
        
        
    }
}
