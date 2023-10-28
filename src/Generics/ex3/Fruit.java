package Generics.ex3;

public class Fruit implements Eatable{
    public String toString(){
        return "Fruit";
    }
}
class Apple extends Fruit{public String toString() {return "Apple";}}
class PineApple extends Fruit{public String toString() {return "PineApple";}}
class Cherry extends Fruit{public String toString() {return "PineApple";}}
class  Rain {public String toString() {return "Rain";}}
class  Ezzange {public String toString() {return "ezzange";}}

interface Eatable{}