package jhkwon.java.fileio;

import java.io.*;
import static java.lang.System.out;

public class IOPractice2{

	public static void main(String... args){
		//Read commandline
		String title = null;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			title = br.readLine();
			br.close();
		} catch(IOException e){
			out.println("io error");
			System.exit(1);
		}

		//read file
		StringBuilder sb = new StringBuilder();
		try{
			BufferedReader br2 = new BufferedReader(new FileReader(title));
			String line = null;
			while ((line=br2.readLine())!=null){
				sb.append(line);
				sb.append('\n');
			}
			br2.close();
		} catch (IOException e){
			out.println("io error");
			System.exit(1);
		}
		String result = sb.toString();
		out.println(result);
		//write file
		try{
			PrintWriter pw = new PrintWriter(new FileWriter("text1_copy"));
			pw.write(result);
			pw.close();
		} catch (IOException e){
			out.println("io error");
			System.exit(1);
		}


	}

}