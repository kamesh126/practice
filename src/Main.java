import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         int A[]={1,2,3,5,2,-6,-5,-8,6};
         int n=A.length;

         for (int i=0;i<n;i++){
             for(int j=i+1;j<n-1;j++){
                 for(int k=j+1;k<n;k++){
                     if(A[i]+A[j]+A[k]==0){
                         System.out.print(A[i]+","+A[j]+","+A[k]);
                         System.out.println(" ");
                     }
                 }
             }
         }

    }
}