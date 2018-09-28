
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
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
            br.write(schueler.getName());
            br.write(";");
            br.write(schueler.getBirthday().toString());
            br.newLine();
        }
        br.flush();
        br.close();
    }
    
    public void load(File f) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(f));
        String input ="";
        while((input=br.readLine())!=null){
            String[] split = input.split(";");
            schuelerlist.add(new Schueler(split[0], LocalDate.parse(split[1])));
        }
        br.close();
        
    }
    
}
