
import java.io.File;
import java.time.LocalDate;



/**
 * @author Kilian Stöckler
 */
public class LoadTester {
    
    public static void main(String[] args) {
        SchulerModel model = new SchulerModel();
        try{
                model.load(new File("./names.csv"));
                model.add(new Schueler("Felix", LocalDate.now()));
                model.save(new File("./names2.csv"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
