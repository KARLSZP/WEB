class D2 {
   String t = "Hello!";   // �Ǿ�̬������
   E s = new E();         // �Ǿ�̬������
   void fD(){             // �Ǿ�̬����
      System.out.println(t);  
   }
   public static void main(String args[]){  // ��̬����
      D2 d = new D2();
      d.s.x  = "Hi!";            // ֱ����s.x�����
      d.fD();                    // ��fD()����d.fD()�����
      System.out.println(d.s.x);
      System.out.println(d.t);   // ��t����d.t�����
   }
}

class E {
   String x="ABC!";
}

