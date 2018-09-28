
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;



/**
 * @author Kilian Stöckler
 */
public class SchulerModel {
    private List<Schueler> schuelerlist = new  ArrayList<>();
    
    public void add(Schueler e){
        schuelerlist.add(e);
    }
    
    public void save(File f) throws Exception{
        BufferedWriter br = new BufferedWriter(new FileWriter(f));
        for (Schueler schueler : schuelerlist) {
            
        }
        
    }
    
    public void load(File f) throws Exception{
        
    }
    
}
