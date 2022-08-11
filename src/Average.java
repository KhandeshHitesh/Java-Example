import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Map;

class Salaries{
    String name;
    String gender;
    int salary;
    Salaries(String name,String gender,int salary){
        this.name=name;
        this.gender=gender;
        this.salary=salary;
    }
    public String getGender(){
        return this.gender;
    }

    public int getSalary() {
        return salary;
    }
}
public class Average {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();
        List<Salaries> emp = new ArrayList<Salaries>();
        for (int i = 0; i < n; i++) {
            String name=inp.nextLine();
            String gender=inp.nextLine();
            int sal=inp.nextInt();
            emp.add(new Salaries(name,gender,sal));
            inp.nextLine();
        }
        Map<String,Double> avgSal=emp.stream().collect(Collectors.groupingBy(Salaries::getGender,Collectors.averagingInt(Salaries::getSalary)));
        for(String s:avgSal.keySet()){
           System.out.println(s+" "+avgSal.get(s));
        }

    }
}
