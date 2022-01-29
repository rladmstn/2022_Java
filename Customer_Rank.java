// 고객 등급 - 다형성
// bronze(0~1000), silver(1001~2000), gold(2001~3000), VIP(3001~)
import java.util.Scanner;

class Rank{
    int point;
    String name;

    Rank(){}
    Rank(int point,String name){
        this.point = point;
        this.name = name;
    }

    void print_rank(int point,String name){
        System.out.printf("%s 고객님 포인트 : %d점\n",name,point);
    }
}

class Bronze extends Rank{
    void print_rank(int point,String name){
        System.out.printf("%s 고객님의 포인트는 %d점으로 Bronze 등급입니다.\n",name,point);
    }
    void print_super(int point,String name){
        super.print_rank(point, name);
    }
}

class Silver extends Rank{
    void print_rank(int point,String name){
        System.out.printf("%s 고객님의 포인트는 %d점으로 Silver 등급입니다.\n",name,point);
    }
    void print_super(int point,String name){
        super.print_rank(point, name);
    }
}

class Gold extends Rank{
    void print_rank(int point,String name){
        System.out.printf("%s 고객님의 포인트는 %d점으로 Gold 등급입니다.\n",name,point);
    }
    void print_super(int point,String name){
        super.print_rank(point, name);
    }
}

class VIP extends Rank{
    void print_rank(int point,String name){
        System.out.printf("%s 고객님의 포인트는 %d점으로 VIP 등급입니다.\n",name,point);
    }
    void print_super(int point,String name){
        super.print_rank(point,name);
    }
}

public class Customer_Rank{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num =0;

        System.out.print("정보를 입력할 고객님의 수를 입력해주세요. : ");
        num = sc.nextInt();
        Rank [] customer = new Rank[num];
    
        for(int i=0;i<num;i++){
            String n;
            int p=0;
            
            System.out.printf("%d번째 고객님의 이름과 포인트를 입력하세요 : ",i+1);
            n = sc.next();
            p = sc.nextInt();

            if((p>0) && (p<=1000)){
                customer[i] = new Bronze();
                customer[i].point = p;
                customer[i].name = n;
            }
            else if((p>1000)&&(p<=2000)){
                customer[i] = new Silver();
                customer[i].point = p;
                customer[i].name = n;
            }
            else if((p>2000) && (p<=3000)){
                customer[i] = new Gold();
                customer[i].point = p;
                customer[i].name = n;
            }
            else if(p>3000){
                customer[i] = new VIP();
                customer[i].point = p;
                customer[i].name = n;
            }
            else
                System.out.println("잘못된 포인트를 입력하셨습니다.");
                
        }

        System.out.print("----------------고객님 포인트 및 등급 확인--------------\n");
        for(int i=0;i<num;i++){

            if(customer[i] instanceof Bronze)
                ((Bronze)customer[i]).print_super(customer[i].point,customer[i].name); // 오버라이딩 이전의 print_rank
            else if (customer[i] instanceof Silver)
                ((Silver)customer[i]).print_super(customer[i].point,customer[i].name);
            else if (customer[i] instanceof Gold)
                ((Gold)customer[i]).print_super(customer[i].point,customer[i].name);
            else if (customer[i] instanceof VIP)
                ((VIP)customer[i]).print_super(customer[i].point,customer[i].name);
        
            customer[i].print_rank(customer[i].point,customer[i].name); // 오버라이딩 이후의 print_rank

        }

        System.out.print("------------고객님 포인트 및 등급 확인 종료-------------\n");
    }
}