public class practice_exception {
    public static void main(String[] args) {
        int x =3;
        int y =4;
        int z = cal(x,y);
        //calは下記メソッドのこと
        //戻り値でaを返していて、3*4の計算結果「12」が入っている

        System.out.println(x+"W"+y+"="+z);
    }
    private static int cal(int x, int y){
        int a = x*y;
        return a;
        //ここでmainメソッドのcalに12が渡される
    }
}
