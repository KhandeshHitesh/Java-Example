import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


class Items{
    String name;
    String category;
    int price;
    Items(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;
    }
    public String getCategory(){
        return this.category;
    }

    public int getPrice() {
        return price;
    }
}
public class Books {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();
        List<Items> item = new ArrayList<Items>();
        for (int i = 0; i < n; i++) {
            String name=inp.nextLine();
            String category=inp.nextLine();
            int price=inp.nextInt();
            item.add(new Items(name,category,price));
            inp.nextLine();
        }

        List<Items> t=item.stream().filter(ite->ite.category.equals("Books") && ite.price>100)
                .collect(Collectors.toList());

        for(Items s:t){
            System.out.println(s.category+" "+s.name+" "+s.price);
        }

    }
}
