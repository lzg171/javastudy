package workspacejava;

public class TestEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEX te = new TestEX();
		te.m(0);
	}

}
void m(int i) throws ArithmeticException {
	if(i == 0 ) {
		throw new ArithmeticException("±»³ýÊýÎª0");
	}
}
