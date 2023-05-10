import java.util.*;

public class assignment {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // Assignment 1 
        // 1
        // 3 2
        // 4 5 6
        // 10 9 8 7
        // 11 12 13 14 15
        System.out.println("Enter the number of rows to be printed for 'Assignment 1' : ");
        int n1 = scan.nextInt();
        System.out.println("Output is : ");
        assignment1(n1);
        System.out.println();

        // Assignment 2
        // * # * # *
        //  $ % % $
        //   * # *
        //    $ %
        //     *
        System.out.println("Enter the number of rows to be printed for 'Assignment 2' : ");
        int n2 = scan.nextInt();
        System.out.println("Output is : ");
        assignment2(n2);
        System.out.println();

        // Assignment 3
        // Zigzag Problem (Zik Zak Problem): The developer needs to process the sequence in a
        // zigzag pattern. That is, if the sequence is [1, 2, 3, 4, 5], the output should be [5, 1, 4, 2, 3].
        // The zigzag pattern starts with the highest number, followed by the smallest number, then the
        // second highest number, followed by the second smallest number, and so on. The developer
        // needs to implement a function that takes in a sequence of integers and returns the sequence
        // in a zigzag pattern.
        System.out.println("Enter the length of sequence for 'Assignment 3' : ");
        int n3 = scan.nextInt();
        System.out.println("Enter the sequence : ");
        int []arr = new int[n3];
        for(int i = 0; i < n3; i++){
            arr[i] = scan.nextInt();
        }

        int []ans = assignment3(arr);

        System.out.println("Output is : ");
        for(int i = 0; i < n3; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Thank you !!!!!");
        scan.close();
    }
    public static void assignment1(int n){
        int val = 1;
        // Iterate for each row from 1 to n
        for(int i = 1; i <= n; i++){
            // For odd rows, print consecutive numbers
            if(i % 2 != 0){
                for(int j = 0; j < i; j++){
                    System.out.print(val + " ");
                    val++;
                }
            }
            // For even rows, print decreasing numbers
            else{
                int num = val + i - 1;
                for(int j = 0; j < i; j++){
                    System.out.print(num + " ");
                    num--;
                    val++;
                }
            }
            System.out.println();
        }
        return;
    } 
    public static void assignment2(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            if(i % 2 != 0){
                for(int j = 0; j < i; j++){
                    if(j % 2 == 0){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("# ");
                    }
                }
            }
            else{
                for(int j = 0; j < i/2; j++){
                    if(j % 2 == 0){
                        System.out.print("$ ");
                        System.out.print("% ");
                    }
                    else{
                        System.out.print("% ");
                        System.out.print("$ ");
                    }
                }
                
            }
            System.out.println();
        }
        return;
    }
    public static int[] assignment3(int []arr){
        int n = arr.length;
        // Sort the input array in ascending order
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        int []ans = new int[n]; 
        for(int k = 0; k < n; k++){
            ans[k] = arr[j]; 
            k++;
            j--;
            if(k >= n){
                break;
            }
            ans[k] = arr[i];
            i++;
        }

        return ans;
    }
}
