package y;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class Serealizzazione 
{
    public static void main( String[] args ) throws Exception
    {
        Classe c1 = new Classe(1, "5B", "37CTE");
        ObjectMapper mappa = new ObjectMapper();
        mappa.writeValue(new File("classe.json"), c1);

    }
}
