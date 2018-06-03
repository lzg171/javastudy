package workspacejava;

import java.awt.List;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=args[0];

		for(int i=1;i<args.length;i++) {
			if( b>args[i] ){

				args[i-1] = args[i];
				args[i] = b;
				
			}
			
			System.out.println(args[i]);
	}

}
