public class practice7 {
    public static void main(String[] args){
        int x,y,z;

        x = 3;
        y = 4;

        z = x;
        x = y;
        y = z;

        System.out.println( "x=" + x + ",y=" + y );
    }
}
