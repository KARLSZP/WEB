public class Exp{
    public static void main(String args[]){
        int x = 5,y = 6,z = 10;     // һ�ζ�����������������ֵ
        int exp = (y + 3) * z + x;  // �ұ�Ϊ�������ʽ, exp��ֵ95
        System.out.println("exp="+exp);

        x = 300;
        boolean r1 = x>10;          // x�Ƿ����10��r1��ֵtrue
        boolean r2 = x<=100;        // x�Ƿ�С�ڵ���100��r2��ֵfalse
        System.out.println("r1=" + r1);
        System.out.println("r2=" + r2);

        y = 99;
        boolean r3 = (y>10)&&(y<100); // y�Ƿ����10����С��100. true
        System.out.println("r3=" + r3);

        z = 16;
        int r4 = z | 0x80001E0F;     // ��λ��   ��� 0x80001E1F
        System.out.printf("r4=0x%x\n",r4);
        int r5 = r4 >> 2;            // �з�������2λ  ��� 0xE287
        System.out.printf("r5=0x%x\n",r5);
        boolean sss = 0 && 1;
    }
}



