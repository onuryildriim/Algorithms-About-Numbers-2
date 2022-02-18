package myJava;

public class Algorithm{

	int odd = 0;
	int even = 0;	

	public void start() {
		
		for(int s = 1; s < 100; s = s+2) {
			odd = odd+s;
			even = even+(s+1);
		}
		
		System.out.println("from 1 to 100 sum of odd numbers " + odd + "\n" + "from 1 to 100 sum of even numbers " + even + "\n");
	}
	
}
