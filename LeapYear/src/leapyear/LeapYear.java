package leapyear;
public class LeapYear {
    public static void main(String[] args) {
    int Year = 2011;
//    boolean Leap = false;
    if(Year % 4 == 0){
        System.out.println(Year +" is a Leap Year");
    }
    else
        System.out.println(Year +" is not a Leap Year");
    } 
}
