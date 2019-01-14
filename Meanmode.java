package meanmode;
import java.util.Scanner;
public class Meanmode {
    static int size;
    static int [] set;
    
    public static void main(String[] args) {
        Users ();
        System.out.println("The Mean is: " + means());
        System.out.println("The Mode is: " + modes());
        
        
                
    }   public static void Users(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter data set:" );
            size = sc.nextInt();
            
            set = new int [size];
            for(int i = 0; i<set.length; i++){
                set[i]= sc.nextInt();
    }

    } public static int means() {
        int sum = 0;
        for (int i = 0; i<set.length; i++){
        sum += set[i];}
        
        sum /= set.length;
        return sum;
            
                
    }public static int modes(){
        int mode = 0, maxCount = 0;
        
        for(int i = 0; i<set.length; i++){
            int count = 0;
            for(int j = 0; j < set.length; j++){
                if(set[i] == set[j]){count++;}
            }
            if (count > maxCount){
                maxCount = count;
                mode = set[i];     }
           
        }
        return mode;

    }
}


Output:
Enter data set:
4
2
14
6
4
The Mean is: 6
The Mode is: 2
