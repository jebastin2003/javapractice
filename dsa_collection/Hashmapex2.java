import java.util.HashMap;

public class Hashmapex2 {
    public static void main(String []args){
        HashMap<String,Integer>hm=new HashMap<String,Integer>();
        hm.put("gfg",12);
        hm.put("jebas",17);
        hm.put("manoj",23);
        if(hm.containsKey("jebas")){
            System.out.println("yes it is");
        }else{
            System.out.println("no");
        }
        System.out.println(hm.size());
        System.out.println(hm.remove("gfg"));
        System.out.println(hm.size());
        if(hm.containsValue(12)){
            System.out.println("yes it is");
        }else{
            System.out.println("no");
        }
        System.out.println(hm.get("manoj"));
        System.out.println(hm.get("hello"));


    }

    
}
