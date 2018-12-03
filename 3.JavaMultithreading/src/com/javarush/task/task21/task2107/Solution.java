package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Глубокое клонирование карты
*/
//done
public class Solution implements Cloneable{

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone =  solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users == clone.users);
            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }


    public Solution clone() throws CloneNotSupportedException {
        super.clone();
        Solution res = new Solution();
        for (Map.Entry<String,User> map : users.entrySet()) {
            res.users.put(map.getKey(),map.getValue().clone());
        }
        return res;
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (!(obj instanceof User)) return false;
                User user = (User) obj;
                return (age == user.age && name.equals(user.name));

        }

        @Override
        public int hashCode() {
            int result = 31*age;
            result += name.hashCode();
            return result;
        }


        public User clone() throws CloneNotSupportedException {
            super.clone();
            return new User(age,name);
        }
    }
}
