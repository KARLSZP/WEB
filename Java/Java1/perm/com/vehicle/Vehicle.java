package com.vehicle;

class Vehicle{
   public int type;          //型号
   protected int miles;      //行驶里程
   int msg;                  //消息
   private int state;        //状态  
   public void drive(){ System.out.println("run!"); }
   protected void repair(){
       System.out.println("repair!"); 
   }
}
