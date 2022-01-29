// 기존학생 및 교환학생 정보 저장, 확인 - 메서드,클래스 연습
import java.util.Scanner;

class Info_Student{ // 기존학생 class
    String school="";
    int number=0;
    String name="";
    
    Info_Student(){}
    Info_Student(String school, int number, String name){
        this.school = school;
        this.number = number;
        this.name = name;
    }

    // public static void Print_all1(int i,Info_Student st){
    //         System.out.println((i+1)+". : "+st.school+" / "+st.number+" / "+st.name);
    // } // 실행 안된 이유 찾기
}

class Info_Transfer extends Info_Student{ // 교환학생 class
    String nationality="";

    Info_Transfer(){};
    Info_Transfer(String nationality){
        this.nationality = nationality;
    }

    // public static void Print_all2(int i,Info_Transfer st){
    //     System.out.println((i+1)+". : "+st.school+" / "+st.number+" / "+st.name+" / "+st.nationality);
    // } // 실행 안된 이유 찾기
}

public class Information_School{

    public static void Input_normal(Scanner sc,int num,Info_Student st[]){
        for(int i=0;i<num;i++){
            st[i] = new Info_Student();
            System.out.printf("%d번째 기존 학생 학교명 : ",i+1);
            st[i].school = sc.nextLine();
            System.out.printf("%d번째 기존 학생 학번 : ",i+1);
            st[i].number = sc.nextInt();
            sc.nextLine();
            System.out.printf("%d번째 기존 학생 이름 : ",i+1);
            st[i].name = sc.nextLine();
        }
        System.out.println(" 기존 학생 정보 입력 완료 \n");
     }

     public static void Input_transfer(Scanner sc,int num,Info_Transfer st[]){
        for(int i=0;i<num;i++){
            st[i] = new Info_Transfer();
            System.out.printf("%d번째 교환 학생 학교명 : ",i+1);
            st[i].school = sc.next();
            System.out.printf("%d번째 교환 학생 학번 : ",i+1);
            st[i].number = sc.nextInt();
            sc.nextLine();
            System.out.printf("%d번째 교환 학생 이름 : ",i+1);
            st[i].name = sc.next();
            System.out.printf("%d번째 교환 학생 국적 : ",i+1);
            st[i].nationality = sc.next();
        }
        System.out.println(" 교환 학생 정보 입력 완료 \n");
     }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("-------------------------------학생 정보 프로그램-------------------------------");
        System.out.println(" 순서 : 1. 기존 학생 정보 입력 / 2. 교환 학생 정보 입력 / 3. 전체 학생 정보 확인 )");
        int num1=0,num2=0;
         // 기존 학생 정보 입력
            System.out.print("1. 정보를 입력할 기존 학생 수 입력 : ");
            num1 = sc.nextInt();
            sc.nextLine();
            Info_Student[] student_n = new Info_Student[num1];
            Input_normal(sc,num1,student_n);
        
         // 교환학생 정보 입력
            System.out.print("2. 정보를 입력할 교환 학생 수 입력 : ");
            num2 = sc.nextInt();
            sc.nextLine();
            Info_Transfer[] student_t = new Info_Transfer[num2];
            Input_transfer(sc,num2,student_t);

        // 전체 학생 정보 확인
            System.out.println("3. 전체 학생 정보 확인 ");
            System.out.println("--------------기존 학생 정보 출력-----------");
            System.out.println("             학교명   /   학번   /   이름   ");
            for(int i=0;i<num1;i++)
                // Info_Student.Print_all1(i,student_n[i]);
                System.out.println("("+(i+1)+". : "+student_n[i].school+" / "+student_n[i].number+" / "+student_n[i].name);

            System.out.println("------------------교환 학생 정보 출력------------------");
            System.out.println("             학교명   /   학번   /   이름   /   국적   ");
            for(int j=0;j<num2;j++)
                // Info_Transfer.Print_all2(j,student_t[j]);
                System.out.println("("+(j+1)+") : "+student_t[j].school+" / "+student_t[j].number+" / "+student_t[j].name+" / "+student_t[j].nationality);

            System.out.println(" 학생 정보 프로그램 종료 ");
    }
}
