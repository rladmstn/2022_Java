// 지출내역 및 월급내역 확인 프로그램 (interface 연습)
import java.util.Scanner;

class Person{
    String name;
    int salary;
    int expenditure;
    
    Person(){}
    Person(String name, int salary, int expenditure){
        this.name = name;
        this.salary = salary;
        this.expenditure = expenditure;
    }
}

interface Salary{
    abstract void in(String account_name,int month,int salary);
}

interface Expenditure{
    abstract void out(String account_name,int month,int expenditure);
}

class Account extends Person implements Salary, Expenditure{
    String account_name = "우리은행";
    int month = 1;

    Account(){}
    Account(String name, int salary, int expenditure){
        super(name,salary,expenditure);
    }

    public void in(String account_name,int month,int salary){
        System.out.printf("%s 계좌로 %d월에 받은 월급은 %,d원 입니다.\n",account_name,month,salary);}
    public void out(String account_name,int month,int expenditure){
        System.out.printf("%s 계좌로 %d월에 지출하신 금액은 %,d원 입니다.\n",account_name,month,expenditure);}
    public void print_name(String account_name,String name){
        System.out.printf("%s의 %s님 계좌입니다.\n",account_name,name);}
}

public class Account_check{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("본인이름, 월급, 지출금액 입력 : ");
        String name = sc.next();
        int salary = sc.nextInt();
        int expenditure = sc.nextInt();

        Account acc = new Account(name,salary,expenditure);
        acc.print_name(acc.account_name,acc.name);
        acc.in(acc.account_name,acc.month,acc.salary);
        acc.out(acc.account_name,acc.month,acc.expenditure);
        
    }
}

// 클래스명.필드변수명 쓰면 객체를 만들지 않고도 바로 호출 가능