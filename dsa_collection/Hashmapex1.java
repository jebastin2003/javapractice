import java.util.HashMap;
import java.util.Map;
public class Hashmapex1 {
    public static void main(String []args){
        HashMap<String,Integer>hm=new HashMap<String,Integer>();
        hm.put("gfg",12);
        hm.put("jebas",17);
        hm.put("manoj",23);
        System.out.println(hm);
        System.out.println(hm.size());
        for(Map.Entry<String,Integer>e:hm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());

        }


    }
}
