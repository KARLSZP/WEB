public class Cast{
    public static void main(String args[]){
        long i = 65536;
        short j = (short)i;  // j����ֵΪ0
        System.out.println("i=" + i + "; j=" + j);
        double x = 10.876;
        int y = (int)x;      // y��ֵΪ10��ȡ����
        System.out.println("x=" + x + "; y=" + y);
    }
}



