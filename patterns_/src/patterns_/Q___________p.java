package patterns_;

public class Q___________p {

	public static void main(String[] args) {
		int n=12;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			if(i==n/4&&j>0&&i<3*n/4||j==n/4&&i>0&&i<3*n/4) {//||j==3*n/4&&j<=n/4) {
				System.out.print("*");
			}else { System.out.print(" ");}
			}System.out.println();}


	}

}
