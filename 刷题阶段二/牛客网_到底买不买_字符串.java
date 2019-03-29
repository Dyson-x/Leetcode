import java.util.Scanner;

/**
 * @author Dyson
 * @date 2019/3/29 20:59
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            int count=0;
            for(int i=0;i<str2.length();i++){
                if(str1.contains(str2.substring(i,i+1))){
                    str1=str1.replaceFirst(str2.substring(i,i+1)," ");
                    count++;
                }
            }
            if(count==str2.length()){
                count=str1.length()-count;
                System.out.println("Yes"+" "+count);
            }else {
                count=str2.length()-count;
                System.out.println("No"+" "+count);
            }
        }
    }
}
