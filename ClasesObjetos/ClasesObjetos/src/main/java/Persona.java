//46. Ejercicio: Creación de Clases en Java
public class Persona {
    private String nombre;
    private String apellido;
    
    public void showNombre()
    {
        System.out.println("Nombre: " + nombre);
    }
    
    public void showApellido()
    {
        System.out.println("Apellido: " + apellido);
    }
    
    public void showNombres()
    {
        System.out.println(nombre + " " + apellido);
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
