package com.vehicle;

class Vehicle{
   public int type;          //�ͺ�
   protected int miles;      //��ʻ���
   int msg;                  //��Ϣ
   private int state;        //״̬  
   public void drive(){ System.out.println("run!"); }
   protected void repair(){
       System.out.println("repair!"); 
   }
}
