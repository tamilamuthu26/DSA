package org.example.DAY4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

//find out the first non repeating character and replace further characters with it till
//its occurrence is found. If any duplicate found replace it with '#'
//
//Ex : input := "aabcbd"
//output := "a#bbcc"
public class P1 {
    public static void main(String[] args) {
        String a= "aabcbd";
        System.out.println(process(a));
    }
    public static String process(String a){

        Map<Character, Integer> map= new HashMap<>();
        Queue<Character> queue= new LinkedList<>();

        StringBuilder sb= new StringBuilder();

        for(char ch: a.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

            queue.offer(ch);


            //removing repeating characters from queue on every iteration
            while(!queue.isEmpty() && map.get(queue.peek())>1){
                queue.poll();
            }

            if(queue.isEmpty()){
                sb.append("#");
            }
            else{
                sb.append(queue.peek());
            }
        }

        return sb.toString();
    }
}
