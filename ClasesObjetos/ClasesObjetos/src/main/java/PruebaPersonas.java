public class PruebaPersonas {
    public static void main(String[] args)
    {
        Persona objetoPersona = new Persona();
        objetoPersona.setNombre("Pepe");
        objetoPersona.setApellido("Pistola");
        System.out.print("objetoPersona: ");
        objetoPersona.showNombres();
        
        Persona objetoPersona2 = new Persona();
        objetoPersona2.setNombre("Raul");
        objetoPersona2.setApellido("Escopeta");
        System.out.print("objetoPersona2: ");
        objetoPersona2.showNombres();
    }
}
