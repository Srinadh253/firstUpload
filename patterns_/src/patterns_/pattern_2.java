package patterns_;

public class pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				
				if(j==0||j==9||i==9/2)//||j==3)
					System.out.print("*");
			else { System.out.print(" ");
			}
		}
		System.out.println("");
		}

	}

}
