public class prime_number {
    public static void main(String[] args) {
        int num = 10;
        for(int i=0;i<num;i++){
            if(prime(i)) {
                System.out.print(i+" ");
            }
        }

    }

    public static boolean prime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

            }
        return true;

        }
    }




