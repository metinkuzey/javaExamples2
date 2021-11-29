import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Write your own phonebook with using console
 * and check the phonebook a contact is exist or not
 * **/
public class Main {
    public static void main(String[] args) {
        Map<String,String> phoneBook = new HashMap<String,String>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,Integer.toString(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            String result=phoneBook.get(s);
            if(result!=null){
                System.out.println(s+"="+result);
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
