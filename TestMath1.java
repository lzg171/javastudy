package workspacejava;

public class TestMath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Math.random();//产生随机的0.0至1.0之间的值
		double b = Math.random();
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println( Math.min(a, b) );
		System.out.println( Math.round(a) );//四舍五入
		System.out.println(Math.E);//自然对数的底数
		System.out.println(Math.PI);//圆周率
		System.out.println( Math.log( Math.pow(Math.E, 15) ) );
	}

}
