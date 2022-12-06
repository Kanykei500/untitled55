import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer>set1=new HashSet<>(Arrays.asList(0,1,2));
        System.out.println(set);
        System.out.println(set1);
        System.out.println(symmetricDifference(set,set1));
    }
    public static Set<Integer> symmetricDifference (Set<Integer> set, Set<Integer> set1){
        Set<Integer>set2=new HashSet<>(set);
        set2.addAll(set1);
        Set<Integer>set3=new HashSet<>(set);
        set3.retainAll(set1);
        set2.removeAll(set3);
        return set2;
    }
}