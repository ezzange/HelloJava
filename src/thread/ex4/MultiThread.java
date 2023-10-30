package thread.ex4;

public class MultiThread extends Thread{
    public void run() {
        int i =10;

        while(i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for (long x = 0; x < 2500000000L; x++); {
            }
            System.out.println("isInterrupted() : " + this.isInterrupted()); // 상태 true 확인
            System.out.println("isInterrupted() : " + this.isInterrupted()); // 상태 true 확인
            // isInterrupted()은 달라지는게 없음 interrupted은 상태를  flase로 초기화

            //카운트를 종료하는 Thread의 상태를 다시 false로 초기화하여 값을 입력해도 카운트는 정상 진행되도록 변경
            System.out.println("isInterrupted() : " + this.interrupted()); // 상태 확인 및 false로 초기화
            System.out.println("isInterrupted() : " + this.interrupted()); // 상태가 이미 flase라서 초기화 하지 않음
        }
        System.out.println("카운트 종료");

    }

}



