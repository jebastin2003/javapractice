import java.util.HashMap;
class userlist{
    HashMap<Integer,Integer>map;
    userlist(){
        map=new HashMap<Integer,Integer>();
    }
    int get(int id){
        return map.get(id);

    }
    void set(int id,int balance){
        map.put(id,balance);

    }
}

public class getsethashmap {
    public static void main(String []args){
        userlist users=new userlist();
        users.set(1,100);
        users.set(2,2000);
        System.out.println(users.get(1));
        users.set(1,500);
        System.out.println(users.get(1));
        System.out.println(users.get(2));

    }
    
}
