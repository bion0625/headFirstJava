public class PoolPuzzleOne{
    public static void main(String[] args) {
        int x = 0;

        while(x < 4) {
            if(x < 1) {
                System.out.print("a");
                System.out.print(" ");
                System.out.print("noise");
            } 
            if(x > 0) {}
            if(x == 1) {
                System.out.print("a");
                System.out.print("noys ");
            }
            if(x > 1) {
                System.out.print("an");
                System.out.print(" oyster ");
                x = x+2;
            } 
            if(x > 3) {} 
            x = x+1;

            System.out.println();
        }
    }
}

// a noise
// annoys
// an oyster