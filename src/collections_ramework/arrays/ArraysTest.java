package collections_ramework.arrays;

import interfacee.ex8.A;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BinaryOperator;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 22, 33}, {111, 222, 333}};
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2D = " + Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, 5);
        int[] arr3 = Arrays.copyOf(arr, 12);
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOfRange(arr, 1,2);
        int[] arr5 = Arrays.copyOfRange(arr3, 0,10);
        System.out.println("arr4 = " + Arrays.toString(arr4));
        System.out.println("arr5 = " + Arrays.toString(arr5));

        int[] arr7 = new int[5];
        Arrays.fill(arr7,7);
        System.out.println("arr7 = " + Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int)(Math.random()*100)+1);
        System.out.println("arr7 = " + Arrays.toString(arr7));
        for (int i : arr7) {
            char[] charArr = new char[i];
            Arrays.fill(charArr, '@');
            System.out.println(new String(charArr)+i);
        }

        String[][] string2D = new String[][]{{"AB","CD","EF"},{"ab"+"cd"+"ef"}};
        String[][] stringArr2D = new String[][]{{"AB","CD","EF"},{"ab"+"cd"+"ef"}};
        System.out.println(Arrays.equals(string2D,stringArr2D)); //2차원 배열은 equals()
        System.out.println(Arrays.deepEquals(string2D,stringArr2D));

        char[] chArr = {'ㄱ','ㅎ','ㅅ','ㅎ','ㄴ','ㄷ','ㄹ','a','b'};

        System.out.println("chArr = "+Arrays.toString(chArr));
        Arrays.sort(chArr);
        System.out.println("index of = ㅅ : "+ Arrays.binarySearch(chArr, 'ㅅ'));
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of = b : "+Arrays.binarySearch(chArr,'b'));
    }

}
