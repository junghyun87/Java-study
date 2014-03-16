package jhkwon.java.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class IOPractice {
	public static void main(String[] args){
		//keyboard input
		
		String fileName = null;
		try{
			System.out.print("Enter file name: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			fileName = br.readLine();
			br.close();

		} catch(IOException ioe){
			System.out.println("IO Error");
			System.exit(1);
		} finally {
			
		}

		//read
		StringBuilder sb = new StringBuilder();
		
		try{
			BufferedReader br2 = new BufferedReader(new FileReader(fileName));
			String line=null;
			while((line = br2.readLine())!=null){
				sb.append(line);
				sb.append("\n");
			}
			br2.close();
		} catch (IOException e){
			throw new RuntimeException("IO Error occured");
		} finally {
			
		}

		String everything = sb.toString();
		System.out.println(everything);

		//write
		PrintWriter writer = null;
		try{
			writer = new PrintWriter(new FileWriter("text1_copy"));
			writer.write(everything);
		} catch (IOException e){
			throw new RuntimeException("IO Error occured");
		} finally{
			writer.close();
		}

		//write2
		BufferedWriter writer2 = null;
		try{
			writer2 = new BufferedWriter(new FileWriter("text1_copy2"));
			writer2.write(everything);
		} catch (IOException e){
			throw new RuntimeException("IO Error occured");
		} finally {
			writer.close();
		}

	}
}