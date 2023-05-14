import java.lang.reflect.Array;
import java.util.ArrayList;
public class Human {
    public Human(){
    }
    public String[] getOrgans(String[] organs){
        organs[0] = "Kidney";
        organs[1] = "Liver";
        organs[2] = "Heart";
        organs[3] = "Eyes";
        organs[4] = "Skin";
        organs[5] = "Spleen";
        organs[6] = "Stomach";
        return organs;
    }
    public Boolean isAlive(String[] x){
        for(String y : x){
            if(!y.equals("")){
                return true;
            }
        }
        return false;
    }
}
