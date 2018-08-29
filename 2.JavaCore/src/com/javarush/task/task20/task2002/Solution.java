package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = new File("C:\\Users\\Nursultan\\Desktop\\Java\\IO\\in.txt");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
                user1.setFirstName("Anna");
                user1.setLastName("Petrova");
                user1.setBirthDate(new Date());
                user1.setCountry(User.Country.RUSSIA);
             Thread.sleep(100);
            User user2 = new User();
                user2.setFirstName("John");
                user2.setLastName("Snow");
                user2.setCountry(User.Country.OTHER);
                user2.setBirthDate(new Date());
//            Thread.sleep(100);
//            User user3 = new User();
//                user3.setFirstName("Petr");
//                user3.setLastName("Poroshenko");
//                user3.setBirthDate(new Date());
//                user3.setCountry(User.Country.UKRAINE);

            javaRush.users.add(user1);
            javaRush.users.add(user2);
//            javaRush.users.add(user3);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);
            for (User user : users) {
                printWriter.print(user.getFirstName());
                printWriter.print(",");
                printWriter.print(user.getLastName());
                printWriter.print(",");
                printWriter.print(user.getBirthDate().getTime());
                printWriter.print(",");
                printWriter.print(user.isMale()?"true":"false");
                printWriter.print(",");

//                System.out.println(User.Country.valueOf("RUSSIA"));

                printWriter.print(user.getCountry().getDisplayedName());
                printWriter.println();
                printWriter.flush();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (bufferedReader.ready()){
                String line = bufferedReader.readLine();
                if (!"".equals(line)) {
                    String[] data = line.split(",");
                    User user = new User();
                    user.setFirstName(data[0]);
                    user.setLastName(data[1]);
                    user.setBirthDate(new Date(Long.valueOf(data[2])));
                    user.setMale(new Boolean(data[3]));
//                    System.out.println(data[4]);
//                    System.out.println(User.Country.);
                    User.Country country = User.Country.valueOf(User.Country.class,data[4].toUpperCase());
                    user.setCountry(country);
                    users.add(user);
                }
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
