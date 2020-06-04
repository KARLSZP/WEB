public class Cast{
    public static void main(String args[]){
        long i = 65536;
        short j = (short)i;  // j被赋值为0
        System.out.println("i=" + i + "; j=" + j);
        double x = 10.876;
        int y = (int)x;      // y赋值为10（取整）
        System.out.println("x=" + x + "; y=" + y);
    }
}



