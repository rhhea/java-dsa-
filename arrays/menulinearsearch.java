package arrays;
import java.util.*;
public class menulinearsearch {
    public static void main(String[] args) {
        String menu[] = {"samosa", "vada", "idli", "dosa", "biryani", "pulao"};
        String item = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the item to search in menu:");
        item = sc.nextLine();
        searchmenu(menu,item);
    }
    public static void searchmenu(String menu[],String item){
        int i;
        for(i=0 ; i<menu.length ; i++){
            if(menu[i].equalsIgnoreCase(item))
            {
                System.out.println("thanks for ordering diva");
                return;
            }
        }
        if(i == menu.length){
            System.out.println("item not found in menu");
    }
}
}
