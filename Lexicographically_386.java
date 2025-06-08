import java.util.*;

class Lexicographically_386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arr.add(i + 1);
        }

        arr.sort((a, b) -> a.toString().compareTo(b.toString()));

        return arr;
    }

    public static void main(String[] args) {
        Lexicographically_386 sol = new Lexicographically_386();
        System.out.println(sol.lexicalOrder(12));
    }
}
