package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AligningCoordinates2 {

	public static void main(String[] args) throws  IOException {
		System.out.println("실행");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int n =Integer.parseInt(br.readLine());
		int [][]arr =new int [n][2]; //좌표기 때문에 두개만 사용
		
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st= new StringTokenizer(br.readLine());
			arr[i][1]=Integer.parseInt(st.nextToken());
			arr[i][0]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr,(a1, a2) -> {
			if(a1[0]==a2[0]) {
				return a1[1]-a2[1];
			}else {
				return a1[0]-a2[0];
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n;i++) {
			sb.append(arr[i][1]+" "+arr[i][0]).append('\n');
		}
		System.out.println(sb);
		
		
	}

}
