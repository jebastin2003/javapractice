import java.util.LinkedHashMap;

public class Linkedhashmapex2 {
    public static void main(String[]args){
        LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>(4,0.6f,true);
        lhm.put(1,"jebastin");
        lhm.put(2,"manoj");
        lhm.put(3,"tawfiq1");
        lhm.put(4,"ram");
        System.out.println(lhm);
        System.out.println(lhm.get(2));
        System.out.println(lhm);
        lhm.put(1,"jebastinjebastin");
        System.out.println(lhm);
    }
}
