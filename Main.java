class Soln {
    public String clearStars(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "de*";
        Soln sc = new Soln();
        System.out.println(sc.clearStars(s));
    }
}
