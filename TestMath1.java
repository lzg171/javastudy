package workspacejava;

public class TestMath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Math.random();//���������0.0��1.0֮���ֵ
		double b = Math.random();
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println( Math.min(a, b) );
		System.out.println( Math.round(a) );//��������
		System.out.println(Math.E);//��Ȼ�����ĵ���
		System.out.println(Math.PI);//Բ����
		System.out.println( Math.log( Math.pow(Math.E, 15) ) );
	}

}
