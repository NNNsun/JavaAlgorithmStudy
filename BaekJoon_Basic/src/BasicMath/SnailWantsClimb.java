package BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnailWantsClimb {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int V=Integer.parseInt(st.nextToken());
		
		
		int day=(V-B)/(A-B);
		if((V-B)%(A-B)!=0) day++;
		System.out.println(day);
		
	}
}
	
	
	
	
//	int A=sc.nextInt();
//	int B=sc.nextInt();
//	int V=sc.nextInt();
//	int count=0;
//	int temp=A;
//	while(true) {
//		count++;
//		if(V<=A) {
//			System.out.println(count);
//			break;
//		}
//			A=A-B;
//			A+=temp;			
//	}
