package it.fi.meucci;

import java.io.File;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Classe c1 = new Classe(1, "5B", "37CTE");
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("classe.xml"), c1);

    }
}
