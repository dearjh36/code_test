package backjoon.done.year25.may;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class No10814_opp {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] p = new Person[n];

        for (int i = 0; i < n; i++){
            p[i] = new Person(sc.nextInt(), sc.next());
        }

        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++){
            // 객체 배열의 객체를 출력하면 해당 인덱스의 객체의 toString()이 출력된다.
            // sb.append(p[i].toString()); 과 동일하게 작동
            sb.append(p[i]);
        }
    }

    public static class Person{
        int age;
        String name;

        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString(){
            return age + " " + name + "\n";
        }
    }
}
