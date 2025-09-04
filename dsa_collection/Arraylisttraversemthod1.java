import java.util.ArrayList;
public class Arraylisttraversemthod1 {
    public static void main(String []args){
        ArrayList<String>al=new ArrayList<String>();
        al.add("gfg");
        al.add("ide");
        al.add("courses");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));

        }

    }
}
