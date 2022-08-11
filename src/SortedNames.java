import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


class FullName{
    String firstname;
    String lastname;
    FullName(String n1,String n2){
        firstname=n1;
        lastname=n2;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
public class SortedNames{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();
        List<FullName> item = new ArrayList<FullName>();
        for (int i = 0; i < n; i++) {
            String name1=inp.nextLine();
            String name2=inp.nextLine();
            item.add(new FullName(name1,name2));
        }

        List<FullName> t=item.stream().sorted(new Comparator<FullName>() {
            @Override
            public int compare(FullName o1, FullName o2) {
                if (o1.firstname.compareTo(o2.firstname)==0){
                    return o1.lastname.compareTo(o2.lastname);
                }
                else
                    return o1.firstname.compareTo(o2.firstname);
            }
        })
                .collect(Collectors.toList());

        for(FullName s:t){
            System.out.println(s.firstname+" "+s.lastname);
        }

    }
}
