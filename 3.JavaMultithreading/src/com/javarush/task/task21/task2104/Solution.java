package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
//done
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

//    @Override
//    public boolean equals(Object n) {
//        if (n == null || !(n instanceof Solution)) return false;
//        else if (n == this) return true;
////        if (!(n instanceof Solution) ) return false;
//        Solution s = (Solution) n;
//        if (first == null && s.first==null && last == null && s.last==null) return true;
//        else if (first == null && s.first==null && last != null && last.equals(s.last)) return true;
//        else if (first != null && first.equals(s.first) && last == null && s.last==null) return true;
//        else return first.equals(s.first) && last.equals(s.last);
//
//    }
//
//    @Override
//    public int hashCode() {
//        return 31 * (first.hashCode() + 17*last.hashCode());
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Solution)) return false;

        Solution solution = (Solution) o;

        if (first != null ? !first.equals(solution.first) : solution.first != null) return false;
        return last != null ? last.equals(solution.last) : solution.last == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
