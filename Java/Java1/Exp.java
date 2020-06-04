public class Exp{
    public static void main(String args[]){
        int x = 5,y = 6,z = 10;     // 一次定义多个变量，并赋初值
        int exp = (y + 3) * z + x;  // 右边为算术表达式, exp得值95
        System.out.println("exp="+exp);

        x = 300;
        boolean r1 = x>10;          // x是否大于10。r1得值true
        boolean r2 = x<=100;        // x是否小于等于100。r2得值false
        System.out.println("r1=" + r1);
        System.out.println("r2=" + r2);

        y = 99;
        boolean r3 = (y>10)&&(y<100); // y是否大于10并且小于100. true
        System.out.println("r3=" + r3);

        z = 16;
        int r4 = z | 0x80001E0F;     // 按位或   结果 0x80001E1F
        System.out.printf("r4=0x%x\n",r4);
        int r5 = r4 >> 2;            // 有符号右移2位  结果 0xE287
        System.out.printf("r5=0x%x\n",r5);
        boolean sss = 0 && 1;
    }
}



