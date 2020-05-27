import java.util.*;
import java.io.*;
public class eazy {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		if(a%2==0)
			System.out.println("odd");
		else
			System.out.println("even");

	}

	
}
