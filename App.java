

public class App
{
    
    public static void main (String[] args)
    {
        System.out.println("INICIO");
        
        Moeda m1 = new Moeda(NomeMoeda.Dez);
        Moeda m2 = new Moeda(NomeMoeda.VinteCinco);
        
        Cofrinho c = new Cofrinho(10);
        c.insere(m1);
        c.insere(m2);
        
        System.out.println( c.getValorTotalCentavos() );
        
        System.out.println( c.retira() );
        System.out.println( c.retira() );
        System.out.println( c.retira() );
        
        System.out.println( c.getValorTotalCentavos() );
        
        
    
    }
}
