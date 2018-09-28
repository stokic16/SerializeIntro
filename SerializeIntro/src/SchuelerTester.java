
import java.io.File;
import java.time.LocalDate;





/**
 * @author Kilian Stöckler
 */
public class SchuelerTester {
    
    public static void main(String[] args) {
        SchulerModel model = new SchulerModel();
        model.add(new Schueler("Felix", LocalDate.now()));
        model.add(new Schueler("Lil Suelymann", LocalDate.now()));
        model.add(new Schueler("John", LocalDate.now()));
        
        try{
            model.save(new File("./names.csv"));
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

}
