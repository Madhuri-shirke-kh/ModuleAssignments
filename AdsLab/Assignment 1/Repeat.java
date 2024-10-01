import java.util.HashMap;

public class Repeat {
    public static void main(String[] args) {
        String str = "aabbcddeffgaaec";
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (map.containsKey(ch)){
                    int val = map.get(ch);
                    map.put(ch, val+1);
                }else{
                    map.put(ch,1);
                }
        }

        System.out.println("Unique Elements: ");
        for (char c: map.keySet()) {
            if (map.get(c) == 2){
                System.out.print(c +" ");
            }
        }
    }
}
