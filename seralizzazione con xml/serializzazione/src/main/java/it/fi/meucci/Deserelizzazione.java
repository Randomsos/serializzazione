package it.fi.meucci;
import java.io.File;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Deserelizzazione {
    public static void main( String[] args ) throws Exception
    {
        XmlMapper xmlmapper = new XmlMapper();
        File file = new File("classe.xml");
        Classe valore = xmlmapper.readValue(file, Classe.class);
        System.out.println(valore.getAula());
    }
}
