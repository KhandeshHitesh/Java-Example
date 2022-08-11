import java.util.*;

class Emp{
    int age;
    String dept;
    String name;
    Emp(int age,String dept,String name){
        this.age=age;
        this.dept=dept;
        this.name=name;
    }
    int getAge(){
        return this.age;
    }
    String getDept(){
        return this.dept;
    }
    String getName(){
        return this.name;
    }
}

public class OldEmployee {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        List<Emp> e=new ArrayList<Emp>();
        for (int i = 0; i < n; i++) {
            int age = inp.nextInt();
            inp.nextLine();
            String dept = inp.nextLine();
            String name= inp.nextLine();
            e.add (new Emp(age,dept,name));
        }
        Optional<Emp> t=e.stream()
                .max((em,em1)->(em.age-em1.age));

        if (t.isPresent()) {
           Emp y = t.get();
            System.out.print(y.getName());
            System.out.print(y.getDept());
        }



    }


}
