//46. Ejercicio: Creación de Clases en Java
public class Persona {
    String nombre;
    String apellido;
    
    public void showNombre()
    {
        System.out.println("Nombre: " + nombre);
    }
    
    public void showApellido()
    {
        System.out.println("Apellido: " + apellido);
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getApellido()
    {
        return apellido;
    }
    
    public void setNombre(String _nombre)
    {
        nombre = _nombre;
    }
    
    public void setApellido(String _apellido)
    {
        apellido = _apellido;
    }
    
}
