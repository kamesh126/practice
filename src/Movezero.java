import java.util.Arrays;

public class Movezero {
    public static void main(String[] args) {
        int ar[]={0,0,1,0,0,3,3,4,};
        int tem=0;
        int n= ar.length;
        for(int i=0;i<n;i++) {
            if (ar[i] != 0) {
                ar[tem++] = ar[i];
               // System.out.println(ar[i]);
            }
        }
            while(tem<n){
                ar[tem++]=0;
            }


                System.out.println(Arrays.toString(ar));

            Arrays.sort(ar);
             System.out.println(Arrays.toString(ar));


        }
    }

