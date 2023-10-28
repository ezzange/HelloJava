package collections_ramework.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", "1111");
        hashMap.put("id5", "5555");
        hashMap.put("id4", "4444");
        hashMap.put("id3", "3333");
        System.out.println("hashMap = " + hashMap);
        hashMap.put("id2", "2000");
        System.out.println("hashMap = " + hashMap);
        //순서 key값이 중복되는 경우 에러나지 않고 마지막 값으로 변경
        Scanner scanner = new Scanner(System.in); // 라인 단위로 입력 받는다.
        while (true) {
            System.out.println("id와 password를 입력하세요");
            System.out.println("id = " );
            String id = scanner.nextLine().trim();
            if (!hashMap.containsKey(id)) {
                System.out.println("입력한 id는 일치하지 않습니다. 다시 입력하세요");
                continue;
            }
            System.out.println("password = ");
            String password = scanner.nextLine().trim();
            if (!hashMap.containsValue(password)) {
                System.out.println("입력한 password는 일치하지 않습니다. 다시 입력하세요");
            } else {
                System.out.println("로그인에 성공하셨습니다.");
                break;
            }
        }



    }
}
