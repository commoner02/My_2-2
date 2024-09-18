import java.util.Scanner;

public class meow{
   public static  void main(String[] args) {
    System.out.println("Enter Array Size:");
    Scanner var=new Scanner(System.in);
    int x=var.nextInt();
    int[] arr=new int[x];
    System.out.println("Enter Array Elements:");
    for(int i=0;i<x;i++){
        int v=var.nextInt();
        arr[i]=v;
    }
    System.out.println("Search Element :");
    int s=var.nextInt();
    int cnt=0;
    for(int i=0;i<x;i++){
        if(s==arr[i]){
          cnt++;
        }
    }
    System.out.println("Count of "+s+ " is "+cnt);
   }
   
}
