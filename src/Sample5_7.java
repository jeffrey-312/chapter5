
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Sample5_7 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("text1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("Goodbye");
			
			pw.close();
			
			System.out.println("��Ƥw�g�J�ɮ�");
		}catch(IOException e){
			System.out.println("��J��X���~");
		}
	}
}
