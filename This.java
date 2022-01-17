import java.util.Scanner;

class test{
    String a;
    int b;
    float c;

    test(){}
    test(String a,int b,float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class This{

    public static void Math(test tes){
        tes.a = tes.a+"이구요";
        tes.b = tes.b+31;
        tes.c = tes.c+31F;
    }
    public static void main(String [] args){
        String a = "String";
        int b = 31;
        float c = 2.41F;
        System.out.println("현재 문자열:String,정수:31,실수:2.41");
        System.out.println("문자열,정수,실수 입력 : ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextLine();
        b = sc.nextInt();
        c = sc.nextFloat();

        test t = new test(a,b,c);
        System.out.println(t.a+","+t.b+","+t.c);
        Math(t);
        System.out.println(t.a+","+t.b+","+t.c);
    }
}