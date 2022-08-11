import java.util.*;
public class FindDuplicateElements {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        List<Integer> a=new ArrayList<Integer>();
        List<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            a.add(inp.nextInt());
        }
        boolean state=false;
        a.sort(Comparator.naturalOrder());
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i)!=a.get(i+1)){
                if (state){
                    System.out.print(a.get(i)+"\t");
                    state=false;
                }
            }
            else{
                state=true;
            }
        }
        if(state)
        System.out.print(a.get(a.size()-1));

    }
}
