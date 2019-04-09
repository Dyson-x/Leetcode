package moth_4.day_9;

import java.util.Scanner;

/**
 * @author Dyson
 * @date 2019/4/9 16:08
 */
public class Test {
    static int[] W={17*29,29,1};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] s1=sc.next().split("\\.");
            String[] s2=sc.next().split("\\.");
            int []P=new int[3];
            int []A=new int[3];
            for(int i=0;i<s1.length;i++){
                P[i]= Integer.parseInt(s1[i]);
                A[i]= Integer.parseInt(s2[i]);
            }
            int a=A[0]*W[0]+A[1]*W[1]+A[2]*W[2];
            int p=P[0]*W[0]+P[1]*W[1]+P[2]*W[2];
            int tmp=a-p;
            if(tmp<0){
                System.out.print("-");
                tmp=-tmp;
            }
            System.out.println(tmp/W[0]+"."+tmp%W[0]/W[1]+"."+tmp%W[0]%W[1]/W[2]);
        }
    }
}
