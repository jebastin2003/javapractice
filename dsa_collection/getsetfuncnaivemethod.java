import java.util.*;

class user{
    int id,balance;
    user(int i,int b){
        id=i;
        balance=b;

    }
}
class userlist{
    ArrayList<user>list;
    userlist(){
        list=new ArrayList<>();
    }

    int get(int id){
        for(user u:list){
            if(u.id==id){
                return u.balance;
            }
        }
        return -1;
    }
    void set(int id,int balance){
        for(user u:list){
            if(u.id==id){
                u.balance=balance;
                return;
            }
        }
        list.add(new user(id,balance));

    }
}

public class getsetfuncnaivemethod {
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
