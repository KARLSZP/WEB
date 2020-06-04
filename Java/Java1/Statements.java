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
	System.out.println("婴儿");
else if(age>=1 && age<10)
	System.out.println("儿童");
else if(age>=10 && age<18)
	System.out.println("少年");
else if(age>=18 && age<45)
	System.out.println("青年");
else
	System.out.println("中年或老年");

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

	/* 求距阵之和
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
		   sum6 = sum6 + j;  //除去对角线的矩阵之和
		}
	}
	System.out.println("triangle2="+sum6);
	
	int sum7=0;		
	for(int i=1;i<=10;i++){			
		for(int j=1;j<=10;j++){			
		   if(j==i){
			   break;
		   }
		   sum7=sum7+j;  //下三角加对角线矩阵之和
		}
	}
	System.out.println("triangle3="+sum7);
	
	int sum8=0;
	cont:
	for(int i=1;i<=10;i++){			
		System.out.println("*");
		for(int j=1;j<=10;j++){			
		   if(j==i){
			   continue cont;  // 一直执行并跳出内层循环直到标号指出外层循环
		   }
		   System.out.print(" "+j);
		   sum8=sum8+j;  			// 下三角加对角线矩阵之和
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
                       break prn;		// 跳出标号指出的外层循环并执行其后的语句
		   }
		   System.out.print(" "+j);
		   sum9=sum9+j;  			// 除去上三角矩阵的之和
		}
	}
	System.out.println("*");   //执行语句"break prn"之后会直接跳到这条语句执行
	System.out.println("triangle5="+sum9);
	
	
  }
}