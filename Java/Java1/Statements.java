public class Statements {
  public static void main(String args[]){

String bkcolor;
String item= "table";;
if(item.equals("table")){
  bkcolor="white";
}
else{
  bkcolor="black";
}
System.out.println("The back color is " 
                   + bkcolor);	
int age = 20;
if(age<1)
	System.out.println("Ӥ��");
else if(age>=1 && age<10)
	System.out.println("��ͯ");
else if(age>=10 && age<18)
	System.out.println("����");
else if(age>=18 && age<45)
	System.out.println("����");
else
	System.out.println("���������");

int cnt = 10;
double x;
switch(cnt){
	case 1: x=5.0;break;
	case 12: x=30.0;break;
	default: x=100.0;
}
System.out.println("x="+x);

int sum1=0;
for(int i=0;i<=100;i++){
	sum1=sum1+i;
}
System.out.println("sum1(1~100)="+sum1);

double sum2=0;
cnt = 0;
double scores[]={100.0, 90.2, 80.0, 78.0,93.5};
for(double score:scores){
	sum2=sum2+score;
	cnt++;
}
System.out.println("avg score="+sum2/cnt);

int sum3 = 0;
int k = 0;
while(k <= 100){
	sum3 = sum3 + k;
	k++;
}
System.out.println("sum3(1~100)=" + sum3);

int sum4 = 0;
k=0;
do{
 sum4 = sum4 + k;
 k++;
}while(k<=100);
System.out.println("sum4(1~100)="+sum4);	

	/* �����֮��
	 * 1 2 3 ... 10
	 * 1 2 3 ... 10
	 * ......
	 * 1 2 3 ... 10
	 */ 
int sum5=0;
for(int i=1;i<=10;i++){			
    for(int j=1;j<=10;j++){			
	sum5 = sum5 + j;
    }
}
System.out.println("triangle1="+sum5);
	
	
	int sum6=0;		
	for(int i=1; i<=10; i++){			
		for(int j=1; j<=10; j++){			
		   if(j==i){
		     continue;
		   }
		   sum6 = sum6 + j;  //��ȥ�Խ��ߵľ���֮��
		}
	}
	System.out.println("triangle2="+sum6);
	
	int sum7=0;		
	for(int i=1;i<=10;i++){			
		for(int j=1;j<=10;j++){			
		   if(j==i){
			   break;
		   }
		   sum7=sum7+j;  //�����ǼӶԽ��߾���֮��
		}
	}
	System.out.println("triangle3="+sum7);
	
	int sum8=0;
	cont:
	for(int i=1;i<=10;i++){			
		System.out.println("*");
		for(int j=1;j<=10;j++){			
		   if(j==i){
			   continue cont;  // һֱִ�в������ڲ�ѭ��ֱ�����ָ�����ѭ��
		   }
		   System.out.print(" "+j);
		   sum8=sum8+j;  			// �����ǼӶԽ��߾���֮��
		}
	}
	System.out.println("*");
	System.out.println("triangle4="+sum8);
	
	int sum9=0;
	prn:
	for(int i=1;i<=10;i++){			
		System.out.println("*");
		for(int j=1;j<=10;j++){			
		   if(sum9>=120){
                       break prn;		// �������ָ�������ѭ����ִ���������
		   }
		   System.out.print(" "+j);
		   sum9=sum9+j;  			// ��ȥ�����Ǿ����֮��
		}
	}
	System.out.println("*");   //ִ�����"break prn"֮���ֱ�������������ִ��
	System.out.println("triangle5="+sum9);
	
	
  }
}