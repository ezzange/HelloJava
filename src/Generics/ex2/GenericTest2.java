package Generics.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GenericTest2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("이짱이","java",1));
        list.add(new Student("이잔의","java",1));
        list.add(new Student("이장희","spring",3));
        Iterator<Student> iterator = list.iterator();

        while (iterator.hasNext()) {//제네릭 사용으로 형변환이 생략 가능 기존의 코드라면 (Student)it.next()).name);
            System.out.println(iterator.next().name);
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        HashMap<String, Student> map = new HashMap<>();
        map.put("2-6", new Student("이짱이", "java", 1, 30, 40, 50,20));
        System.out.println(map);
        //{ } 사라짐
        Student student = map.get("2-6");
        System.out.println(student);


    }
}
