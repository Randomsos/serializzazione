package y;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserealizzazione {
    public static void main( String[] args ) throws Exception
    {
        ObjectMapper mappa = new ObjectMapper();
        File file = new File("classe.json");
        Classe valore = mappa.readValue(file, Classe.class);
        System.out.println(valore.getAula());
    }
}
