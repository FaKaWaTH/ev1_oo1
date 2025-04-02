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
        
        System.out.println(objetos[0].id +" "+ objetos[0].nombre +" "+ objetos[0].correo +" "+ objetos[0].mayorEdad);
    }
}
