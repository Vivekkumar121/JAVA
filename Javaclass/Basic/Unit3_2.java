package simran;

import java.util.Scanner;

class voter {
	int a;
	voter(int a){
		this.a = a;
	}
	boolean checkAge() throws Exception {
		{
			if(a < 18 ) {
				throw new Exception("AGe should be greater than 19");
			}
			else 
				return true;
		}
	}
	void checkValidity() throws Exception {
		if(checkAge()) {
			System.out.println("You can vote ");
		}
	}
}

class throws_vivek {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int b = sc.nextInt();
		voter v = new voter(b);
		try {
			v.checkValidity();
		}
		catch(Exception e) {
			System.out.println("Vote nhi doge tum");
		}
	}
}