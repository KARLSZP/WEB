class D {
   String s = "Hello!";        // �Ǿ�̬������
   static String t = "Hi!";    // ��̬������

   void fD1(){                 // �Ǿ�̬����
      System.out.println("D,"+s);  
   }

   static void fD2(){          // ��̬����
      System.out.println("D,"+t);  
   }

   public static void main(String args[]){  // ��̬����
      //System.out.println(s); // ����!!
      System.out.println(t);
      //fD1();                 // ����!!
      fD2();
   }
}
