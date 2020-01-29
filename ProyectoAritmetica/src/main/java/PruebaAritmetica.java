public class PruebaAritmetica 
{
    public static void main(String[] args)
    {
        Aritmetica aritmeticaObject = new Aritmetica(2,3);
        System.out.println(aritmeticaObject.sumar());
        
        Aritmetica aritmetica2 = new Aritmetica();
        System.out.println(aritmetica2.sumar());
    }
}
