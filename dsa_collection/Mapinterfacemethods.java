import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class Mapinterfacemethods {
    public static void main(String []args){
        Map<Integer,String>m=new HashMap<>();
        m.put(100,"gfg");
        m.put(200,"jebastin");
        m.put(150,"surya");
        System.out.println(m);
        System.out.println(m.get(100));
        System.out.println(m.get(10));
        String removedvalue=m.remove(200);
        System.out.println(removedvalue);
        System.out.println(m);
        System.out.println(m.containsKey(100));
        System.out.println(m.containsValue("gfg"));
        m.replace(100,"jesus");
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.keySet());
        System.out.println(m.values());
        Set<Map.Entry<Integer,String>>entries=m.entrySet();
        for(Map.Entry<Integer,String>entry:entries){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println(m.getOrDefault(300,"notfound"));
        System.out.println(m.isEmpty());
        m.clear();
        System.out.println(m.isEmpty());
    }
}
