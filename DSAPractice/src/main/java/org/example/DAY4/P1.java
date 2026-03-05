package org.example.DAY4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

//find out the first non repeating character and replace further characters with it till
//its occurrence is found. If any duplicate found replace it with '#'
//Ex : input := "aabcbd"
//output := "a#bbcc"
public class P1 {
    public static void main(String[] args) {
        String a= "aabcbd";
        System.out.println(process(a));
    }
    public static String process(String a){
        Map<Character, Integer> map= new HashMap<>();
        Queue<Character> q= new LinkedList<>();

        StringBuilder sb= new StringBuilder();

        for(char ch : a.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
            q.offer(ch);

            while(!q.isEmpty() && map.get(q.peek())>1){
                q.poll();
            }

            if(q.isEmpty()){
                sb.append("#");
            }
            else{
                sb.append(q.peek());
            }
        }
        return  sb.toString();
    }
}
