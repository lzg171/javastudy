package workspacejava;

public class TestArray31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] d;//�����άdouble��������
		String s = "1,2;3,4,5;6,7,8";
		System.out.println(s);
		String[] sFirst = s.split( ";" );//�Էֺţ����������ַ����������µ��ַ�������
		System.out.println( "sFirst.length = "+sFirst.length );
		
		d = new double[sFirst.length][];
		
		for(int i=0;i<sFirst.length;i++ ) {
			//System.out.println( "sFirst["+i+"]= "+sFirst[i] );
			String[] sSecond = sFirst[i].split(",");
			d[i] = new double[sSecond.length];
			
			for(int j=0;j<sSecond.length;j++) {
				
				d[i][j] = Double.parseDouble(sSecond[j]);
				System.out.println( sSecond[j] );
			}
		}
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.println(d[i][j]);
			}
		}
	}

}
