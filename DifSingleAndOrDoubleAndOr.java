package week_04;

public class DifSingleAndOrDoubleAndOr {
    public static void main(String[] args) {
        int a=10;
        boolean value= (4<5)&(++a==10);
        System.out.println(a);
        System.out.println("value = " + value);

        boolean value1= (4<5)&&(++a==12);
        System.out.println(a);
        System.out.println("value1 = " + value1);



    }
}
