package objectt.ex4;

import objectt.ex1.Value;

public class StringMethodTest {
    public static void main(String[] args) {




//         String(string string)
        String s = new String("string");
        System.out.println(s);

//         String(char[] value)
        char[] c = {'H','E','L','L','O'};
        String s1 = new String(c);

//        String(StringBuffer stringbuffer)
        StringBuffer sb = new StringBuffer("Hello");
        String s2 = new String(sb);

//        char charAt(int index)
        String string = "string";
        String aaa = "143627";
        char c1 = string.charAt(1);
        char c2 = aaa.charAt(1);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

//        int compareTo(String string)
        int i1 = "bbb".compareTo("aaa");
        int i2 = "bbb".compareTo("bbb");
        int i3 = "bbb".compareTo("ccc");
        System.out.println("i1 = "+i1);
        System.out.println("i2 = "+i2);
        System.out.println("i3 = "+i3);


//        String concat(String string)
        String ddd = "ddd";
        String eee = ddd.concat("eee");
        System.out.println("eee = " + eee);

//        boolean contains(CharSequence string)
        String fff = "fff";
        boolean b = fff.contains("f");
        System.out.println("b = " + b);

//        boolean startsWith(String prefix)

//        boolean endsWith(String suffix)
        String file = "Hello.txt";
        boolean b1 = file.endsWith("txt");
        System.out.println("b1 = " + b1);

//        boolean equalsIgnoreCase(String string)
        String ggg = "ggg";
        boolean b2 = ggg.equalsIgnoreCase("ggg");
        System.out.println("b2 = " + b2);
        boolean b3 = ggg.equalsIgnoreCase("GGG");
        System.out.println("b3 = " + b3);

//        int indexOf(int char)
        String hhh = "helloString";
        int idx = hhh.indexOf("h");
        System.out.println("idx = " + idx);
        int idx2 = hhh.indexOf("g");
        System.out.println("idx2 = " + idx2);


//        int indexOf(int char, int pos)
        String iii = "helloString";
        int idx3 = iii.indexOf('e','1');
        System.out.println("idx3 = " + idx3);
        int idx4 = iii.indexOf('l','1');
        System.out.println("idx4 = " + idx4);

//        int indexOf(String string)
        String jjj = "helloString";
        int idx5 = jjj.indexOf("ing");
        System.out.println("idx5 = " + idx5);

//        int lastIndexOf(int char)
        String kkk = "java.lang.Object";
        int idx6 = kkk.lastIndexOf('.');
        System.out.println("idx6 = " + idx6);

//        int lastIndexOf(String string)
        String lll = "java.lang.java";
        int idx7 = lll.lastIndexOf("java");
        System.out.println("idx7 = " + idx7);
        int idx8 = lll.indexOf("java");
        System.out.println("idx8 = " + idx8);

//        int length()
        String mmm = "Hello";
        int length = mmm.length();


//        String[] split(String regex)
        String nnn = "apple,banana,Pineapple,apple";
        String[] arr = nnn.split(",");
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);

//        String[] split(String regex, int limit)
        String ooo = "apple,banana,Pineapple,apple";
        String[] arr2 = ooo.split(",",2);
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);

//        String substring(int begin)
        String ppp = "java.lang.Objcet";
        boolean b4 = ppp.startsWith("java");
        System.out.println("b4 = " + b4);
        boolean b5 = ppp.startsWith("lang");
        System.out.println("b5 = " + b5);

//        String substring(int begin)
//        String substring(int begin, int end)
        String qqq = "java.lang.Objcet";
        String rrr = qqq.substring(10);
        System.out.println("rrr = " + rrr);
        String sss = qqq.substring(5, 9);
        System.out.println("sss = " + sss);


//        String toLowerCase()
        String ttt = "Hello";
        String uuu = ttt.toLowerCase();
        System.out.println("uuu = " + uuu);

//        String toUpperCase()
        String vvv = "Hello";
        String www = ttt.toUpperCase();
        System.out.println("www = " + www);

//        String trim()
        String xxx = " Hello world   ";
        String yyy = xxx.trim();
        System.out.println("yyy = " + yyy);

//        static String valueOf(변수 타입 변수명)
        String zzz = String.valueOf(100);
        System.out.println("zzz = " + zzz);
        java.util.Date da = new java.util.Date();
        String date = String.valueOf(da);
        System.out.println("date = " + date);

        //    join()
        String fruit = "apple,banana,Pineapple,apple";
        String[] strings = fruit.split(",");
        System.out.println("strings = " + strings);
        String fruit2 = String.join(",");
        System.out.println("fruit2 = " + fruit2);

        //숫자를 문자열로 변환
        int i = 100;
        String str1 = i+""; // 가독성이 좋다. 속도가 비교적 느리다.
        String str2 = String.valueOf(i); //속도가 비교적 빠르다. 가독성에 좋지 않다.
        //문자열을 숫자로 변환
        i = Integer.parseInt("100");
        i2 = Integer.valueOf("100");
        Integer integer = Integer.valueOf("100");
    }


}
