
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static int L;
	static int C;
	static char [] code;
	static char [] list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		list = new char[C];
		code = new char[L];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < C ; i++) {
			list[i] = st.nextToken().charAt(0);	// 앞글자만 받아서 char 형태로 저장	
		}
		Arrays.sort(list); // 조건값에 맞게 정렬
		
		makeCode(0,0); // 코드생성 함수
    }
	public static void makeCode(int x, int idx) {
		if(idx == L) { // 깊이비교
			if(isValid()) { // 모음, 자음 개수 확인함수
				System.out.println(code);
			}
			return;
		}
		// 아직 길이가 남았을때
		for(int i = x; i < C ; i++) {
			code[idx] = list[i];
			makeCode(i+1, idx +1);
		}
	}
	
	public static boolean isValid() {
		int mo = 0;
		int ja = 0;
		
		for(char c : code) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				mo++;
			} else {
				ja++;
			}
		}
		if(mo >=1 && ja >=2) {
			return true;
		}
		return false;
	}
    
}