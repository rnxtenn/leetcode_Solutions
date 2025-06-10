import java.util.*;
class minmax{
    public int maxDifference(String s) {
        HashMap<Character,Integer> countchar = new HashMap<>();
        // s.toCharArray is simply convert the s to an array
        // for loop we have used "foreach(datatype variable collections)"loop, it used generally when we need to loop over array or hashmaps.
        for(char c : s.toCharArray()){
            // this line is adding the result to map using put method
            // getOfDefault(c,0) means that if the c -> character exits or not if not then its value is o.
            // in hashmap put() method is used to insert values in map , syntax is countchar.put(key,value).
            countchar.put(c,countchar.getOrDefault(c,0)+1);
        }
        // now we have to initailise the maxodd and maxeven
        int maxodd=Integer.MIN_VALUE;
        int maxeven=Integer.MIN_VALUE;
        // again we will be using for each() because to loop over each character in an array
        // now we check the condition
        for(int freq : countchar.values()){
            if(freq % 2 == 0){
                maxeven = Math.max(maxeven,freq);
            }else{
                maxodd = Math.min(maxodd,freq);
            }
        }
        if (maxeven == Integer.MIN_VALUE) maxeven = 0;
        if (maxodd == Integer.MIN_VALUE) maxodd = 0;

        // we use abs()means absolute difference
        return Math.abs(maxeven-maxodd);
    }
}
public class Diference_Odd_even_3442 {
    public static void main(String[] args){
        minmax mn = new minmax();
        System.out.print(mn.maxDifference("aaaaaabbb"));
    }

}
