
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




public class Sample5_8 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("text1.txt"));
			
			String str1=br.readLine();
			String str2=br.readLine();
			
			System.out.println("寫到檔案中的兩個字串是");
			System.out.println(str1);
			System.out.println(str2);
		}catch(IOException e){
			System.out.println("輸入輸出有誤");
		}
	}
}
