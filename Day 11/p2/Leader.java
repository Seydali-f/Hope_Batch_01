import java.util.*;
public class Leader {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] arr=new int[length];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt();
           System.out.print(arr[i]+" ");
        }
        int size=0;
        boolean res=false;
        for (int i = 0; i < length; i++) {
            if(i==length-1){
                arr[size]=arr[i];
            }
            int count=i+1;
            while(count<arr.length){
                if(arr[i]<arr[count]){
                    res=true;
                    break;
                }
                else{
                    count++;
                }
            }
            if(!res){
                arr[size]=arr[i];
                System.out.println(arr[i]);
                size++;

            }
            
        }
        for (int i=0;i<size;i++) {
           System.out.print(arr[i]);
            
        }}
        }

    
