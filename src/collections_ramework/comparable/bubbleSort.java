package collections_ramework.comparable;

public class bubbleSort {
    // 버블정렬의 정렬 로직은 불변이고 변경할 수 있는 부분은 if의 조건문인데 이는
    // 오름차순에서 내림차순으로 정렬기준을 변경할 때 정렬 로직은 그대로 두고  어떻게 비교 할지 정렬 기준만 변경한 것과 같은 맥락이다.
    public void sort(int[] intArr){
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = 0; j < intArr.length - 1 - i; j++) {
                int tmp = 0;

                if (intArr[j] > intArr[j+1]) {
                    tmp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j + i] = tmp;
                }

            }
        }
        }
}
