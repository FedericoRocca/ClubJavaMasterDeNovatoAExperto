public class Aritmetica 
{
    int a;
    int b;
    
    public int sumar()
    {
        return a + b;
    }
    
    public Aritmetica()
    {
        a = 3;
        b = 5;
        System.out.println("Se ejecuta el constructor vacio");
    }
    
    public Aritmetica(int arg1, int arg2)
    {
        a = arg1;
        b = arg2;
    }
}
