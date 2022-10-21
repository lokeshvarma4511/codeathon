package company.codeathon;
import java.util.*;
public class MatchThePairs {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            l1.add(arr[i]);
        }
        Set<Integer> h1 = new HashSet<>(Arrays.asList(arr));
        System.out.println(l1);
        System.out.println(h1);
        int count1 = (int) h1.stream().count();
        int count2 = (int) l1.stream().count();
        int total = count2 - count1;

        int count3 = 0;
        for (int i : h1) {
            count3 =count3 + (Collections.frequency(l1, i))/2;
        }
        System.out.println(count3);
    }
}