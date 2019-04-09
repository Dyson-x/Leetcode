package moth_4.day_9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Dyson
 * @date 2019/4/9 16:55
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int al=sc.nextInt();
            long []a=new long[al];
            for(int i=0;i<al;i++){
                a[i]=sc.nextLong();
            }
            int bl=sc.nextInt();
            long[] b=new long[bl];
            for(int i=0;i<bl;i++){
                b[i]=sc.nextLong();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int ap=0,bp=0;
            for(int i=0;i<a.length;i++){
                if(a[i]>0){
                    ap=i;
                    break;
                }
            }
            for(int i=0;i<b.length;i++){
                if(b[i]>0){
                    bp=i;
                    break;
                }
            }
            long sum=0;
            for(int i=0;i<ap&&i<bp;i++){
                sum+=a[i]*b[i];
            }
            for(int i=a.length-1,j=b.length-1;i>=ap&&j>=bp;i--,j--){
                sum+=a[i]*b[j];
            }
            System.out.println(sum);
        }
    }
}
