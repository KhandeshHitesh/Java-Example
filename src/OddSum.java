import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    int id;
    int salary;
    Employee(int id,int salary){
        this.id=id;
        this.salary=salary;
    }
    int getId(){
        return this.id;
    }
    int getSalary(){
        return this.salary;
    }
}

public class OddSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        List<Employee> e = new ArrayList<Employee>();
        for (int i = 0; i < n; i++) {
            int id = inp.nextInt();
            int salary = inp.nextInt();
            e.add(new Employee(id, salary));
        }
        int sum1 =0;
        Integer sum=e.stream()
                .filter(em->em.getId()%2==1)
                .mapToInt((em->em.getSalary()))
                .sum();
        System.out.print(sum);
    }
        }

