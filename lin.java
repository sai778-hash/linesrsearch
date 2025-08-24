import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element:");
        int n = sc.nextInt();
        int arr[] = new int [15];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0 ;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();
        linearsearch1 l1 = new linearsearch1();
        l1.search(arr, target, n);
    }
    
}
class linearsearch1{
    void search(int []arr,int target,int size){
        for(int i=0;i<size;i++){
            if(arr[i] == target){
                System.out.println("the element at the index position is :"+ i);
            }
        }
    }
}


