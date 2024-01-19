//For flip() function
//Time complexity - O(n*n)
//Space complexity - O(1) 
package array;
import java.util.Scanner;
public class image {
    public static void flip(int[][] img) {
        for(int i=0;i<img.length;i++) {
            for(int j=0;j<img.length/2;j++) {
                int temp = img[i][j];
                img[i][j] = img[i][img.length-1-j];
                img[i][img.length-1-j] = temp;
            }
        }
        for(int i=0;i<img.length;i++) {
            for(int j=0;j<img.length;j++) {
                if(img[i][j]==0)
                    img[i][j] = 1;
                else
                    img[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[][] img = new int[n][n];
        System.out.print("Enter image dimensions: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                img[i][j] = sc.nextInt();
            }
        }
        flip(img);
        System.out.println("Resultant image dimension");
        for(int i=0;i<img.length;i++) {
            for(int j=0;j<img.length;j++) {
                System.out.print(img[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
