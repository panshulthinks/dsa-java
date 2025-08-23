import java.util.*; 
public class question5 {
    public static void main(String args[]){
        System.out.println("enter x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.err.println("enter n ");
        int n = sc.nextInt();
        
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans * x;
        }
        System.out.println(ans);
        
    }
}
