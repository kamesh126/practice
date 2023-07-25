import java.util.Arrays;

public class coin {
    public static void main(String[] args) {
        int ar[]={1,2,3};
       // Arrays.sort(ar);
        int amount=11;//output 3
        int count=0;
        int max=0;
        int remainder = 0;
        int n=ar.length;
        for (int i=0;i<n;i++){
            if(max<ar[i]){
                max=ar[i];
            }
        }
       // System.out.println(max);

                 while(amount >= max) {
                     amount = amount - max;
                     count = count + 1;
                     remainder=amount%3;
                 }
                    for(int i=0;i<n;i++){
                        if(remainder==ar[i]) {
                            count = count + 1;
                            remainder = remainder - ar[i];

                            if (ar[i] > amount) {
                                count = count - 1;
                            }
                        }

                    }
        System.out.println(count);



        }


    }

