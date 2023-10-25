package modifider.encapsulation.ex2;

class Time{
    private int hour;
    private int minute;
    private int second;

    public int getHour(){ return hour; }; //값을 가져오는 메서드

    public void setHour(int hour){ //원하는 값만 접근되도록 설정한 메서드
        if (hour < 0 || hour > 23)return;
        this.hour = hour;

    }
}

