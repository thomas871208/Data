package tts.com;

import java.util.Random;

public class Snow extends Thread{

	int n =0;
    Random random = new Random();
    public void count() {
    	for(int i=1;i<=5;i++) {
			if(i%5==0) {
				int m1 = random.nextInt(5)+15;			
				for(int j=0;j<m1;j++) {
					System.out.print(" ");
					 n = random.nextInt(3)-1;

					}
			m1 = m1+n;
			System.out.println(getName());
			}
			if(i%5==1) {
				int m2 = random.nextInt(5)+15;			
				for(int j=0;j<m2;j++) {
					System.out.print(" ");
					n = random.nextInt(3)-1;

			}
			m2 = m2+n;
			System.out.print(getName());
			}
			if(i%5==2) {				
				int m3 = random.nextInt(5)+15;						
			for(int j=0;j<m3;j++) {
				System.out.print(" ");
				n = random.nextInt(3)-1;

				}
			m3 = m3+n;
			System.out.print(getName());
			}
			if(i%5==3) {
				int m4 = random.nextInt(5)+15;						
			for(int j=0;j<m4;j++) {
				System.out.print(" ");
				n = random.nextInt(3)-1;

			}
			m4 = m4+n;
			System.out.print(getName());
			}
			if(i%5==4) {
				int m5 = random.nextInt(5)+15;						
			for(int j=0;j<m5;j++) {
				System.out.print(" ");
				n = random.nextInt(3)-1;

				}
			m5 = m5+n;
			System.out.print(getName());
			}
			else{
				
			}
    	}
	}
	@Override
	public void run() {

		for(int i=1;i<=100;i++) {
			count();
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		super.run();
	}
	public Snow(String name) {
	setName(name);
	}
}
