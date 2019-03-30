import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Dyson
 * @date 2019/3/30 20:27
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int len=sc.nextInt();
            int [] a=new int[len];
            for(int i=0;i<len;i++){
                a[i]=sc.nextInt();
            }
            int a1=0,a2=0,a3=0,a5=0;
            int[] b={0,0,0,0,0};
            double a4=0;
            int flag=1,cou=0;
            for(int i:a){
                if(i%5==0&&i%2==0){
                    a1+=i;
                    b[0]=1;
                }else if(i%5==1){
                    a2+=i*flag;
                    flag*=-1;
                    b[1]=1;
                }else if(i%5==2){
                    a3++;
                    b[2]=1;
                }else if(i%5==3){
                    a4+=i;
                    cou++;
                    b[3]=1;
                }else {
                    a5=i>a5?i:a5;
                    b[4]=1;
                }
            }
            if(b[0]==0){
                System.out.print("N ");
            }else {
                System.out.print(a1+" ");
            }
            if(b[1]==0){
                System.out.print("N ");
            }else {
                System.out.print(a2+" ");
            }
            if(b[2]==0){
                System.out.print("N ");
            }else {
                System.out.print(a3+" ");
            }
            if(b[3]==0){
                System.out.print("N ");
            }else {
                a4/=cou;
                a4=new BigDecimal(a4).setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
                System.out.print(a4+" ");
            }
            if(b[4]==0){
                System.out.print("N");
            }else {
                System.out.print(a5);
            }
        }
    }
}

