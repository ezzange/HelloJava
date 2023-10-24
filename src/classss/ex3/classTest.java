package classss.ex2;

class Time {
    int hour;
    int minute;
    int second;

    //hour, minute, second를 Time으로 묶을 수 있다.
    // => Time time = new Time();
}

class Time2 {
    int hour1, hour2, hour3;
    int minute1, minute2, minute3;
    int second1, second2, second3;

//    3개의 시간을 배열로 묶어 간결하게 표현할 수 있다.
//    Time2 timeA = new Time2();
//    Time2 timeB = new Time2();
//    Time2 timeC = new Time2();
}

class Time3 {
    int[] hour = new int[3];
    int[] minute = new int[3];
    int[] second = new int[3];

//    시,분,초가 각 각의 배열로 묶여있는 것을 time3라는 객체 배열로 묶어줄 수 있다.
//    Time3[] time3 = new Time3[3];
//    time3[0] = new Time3();
//    time3[1] = new Time3();
//    time3[2] = new Time3();

}

public class classTest {
    public static void main(String[] args) {
//        int hour = 1;
//        int minute = 10;
//        int second = 20;

        Time time = new Time();
        time.hour=2;
        time.minute=20;
        time.second=40;

        Time2 timeA = new Time2();
        Time2 timeB = new Time2();
        Time2 timeC = new Time2();

        Time3[] time3 = new Time3[3];
        time3[0] = new Time3();
        time3[1] = new Time3();
        time3[2] = new Time3();
    }
}
