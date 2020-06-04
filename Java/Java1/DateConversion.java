 // DateConversion.java
 import java.util.*; //��ʽ��ʱ��: Date Calendar
 import java.text.*; //��ʽ��ʱ��: DateFormat SimpleDateFormat
 public class DateConversion {
 public static void main(String args[]) throws ParseException {
  // ��ʱ��ת��Ϊ�ַ���
  Date now = new Date();
  System.out.println(""+now);      //��ʾ��Thu Aug 21 11:36:59 CST 2014
  DateFormat sdf1                  // Ĭ��Ϊ�������ԣ�ʡ�Եڶ���������
             = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa E",Locale.ENGLISH); //M hh         
  System.out.println(sdf1.format(now)); //��ʾ��  2014-08-21 11:42:37 AM Thu
  
  // ���ַ���ת��Ϊʱ��
  Date date1 = sdf1.parse("2008-07-10 19:20:00 PM FRI"); 
  System.out.println(sdf1.format(date1));
  
  //ȡ��������: Calendar.YEAR .MONTH .DAY_OF_MONTH .HOUR .MINUTE 
  //  .SECOND .MILLISECOND .DATE .AM_PM .DAY_OF_YEAR
  //  .DAY_OF_WEEK .HOUR_OF_DAY .ZONE_OFFSET
  Calendar cal=Calendar.getInstance();
  cal.setTime(new Date());       //cal����Ϊ��ǰʱ��    
  System.out.println("cal.DAY_OF_MONTH: "+cal.get(Calendar.DAY_OF_MONTH)); 
  System.out.println("cal.DAY_OF_WEEK: "+cal.get(Calendar.DAY_OF_WEEK)); 
  System.out.println("cal.HOUR: "+cal.get(Calendar.HOUR)); 
  System.out.println("cal.HOUR_OF_DAY: "+cal.get(Calendar.HOUR_OF_DAY));

  // ��������
  Calendar cal1=Calendar.getInstance();
  cal1.setTime(now);                    //cal1 ����Ϊ��ǰʱ��
  cal1.add(Calendar.DAY_OF_YEAR, 20);   //����20�졣-20���Ǽ�20��
  System.out.println("cal.add: "+cal1.get(Calendar.DAY_OF_MONTH));

  // �Ƚ�����
  boolean b1=cal.before(cal1);   
  System.out.println("cal.before: "+b1);

  // ����������֮�������
  DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //M hh         
  Calendar cal2 = Calendar.getInstance();    
  cal2.setTime(sdf2.parse("2012-09-08 10:10:10"));
  Calendar cal3 = Calendar.getInstance();    
  cal3.setTime(sdf2.parse("2012-09-15 00:00:00"));
  System.out.println(""+(cal3.getTimeInMillis()-cal2.getTimeInMillis())/(1000*3600*24));
 }
}


