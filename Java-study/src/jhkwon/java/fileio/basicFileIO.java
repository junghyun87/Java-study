package jhkwon.java.fileio;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

public class basicFileIO {
	public static void main(String[] args) throws IOException{
		//You can access files relative to the current execution directory of your Java program. 
		//To print the current directory in which your Java program is running, you can use the following statement.
		out.println(System.getProperty("user.dir"));

		//Reading resources out of your project / jar
		//You can read read resources from your project or your jar file via the .getClass().getResourceAsStream() method chain from any object.
		InputStream fileInputStream = new basicFileIO().getClass().getResourceAsStream("resources/test.txt");


	}

	//http://www.vogella.com/articles/JavaIO/article.html
	//FileReader, BufferedReader
	//FileWriter, BufferedWriter
	//Memorize!
	public String basicReadFile(String filename){
		//File read
		String returnValue="";
		FileReader file = null;
		String line = "";
		String filename1="";
		try{
			file = new FileReader(filename1);
			BufferedReader reader = new BufferedReader(file);
			while((line=reader.readLine())!= null){
				returnValue += line + "\n";
			}

		}catch (FileNotFoundException e){
			throw new RuntimeException("File not found");
		}catch (IOException e){
			throw new RuntimeException("IO Error occured");
		} finally {
			if (file!=null){
				try{
					file.close();
				}catch (IOException e){
					e.printStackTrace();
				}
			}
		}
		return returnValue;
	}
	//Memorize!
	public void basicWriteFile(String filename, String s){
		FileWriter output = null;
		try {
			output = new FileWriter(filename);
			BufferedWriter writer = new BufferedWriter(output);
			writer.write(s);
		} catch (IOException e){
			e.printStackTrace();
		}finally{
			if(output!=null){
				try {
					output.close();
				}catch (IOException e){
					e.printStackTrace();
				}
			}
		}
	}

	//byte stream
	//important methods
	//int read() : Reads a byte of data from this input stream
	//int read(byte[] b) : Reads up to b.length bytes of data from this input stream into an array of bytes
	//void write (int b) : Writes the specified byte to this file output stream.
	//void write(byte[] b) : Writes b.length bytes from the specified byte array to this file output stream.
	//void close() : Closes the file input and output streams and releases any system resources associated with the stream
	public void basicByteStreamReadAndWrite() throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("myfile.txt");
			out = new FileOutputStream("outagain.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c); 
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null){ 
				out.close(); 
			}
		}
	}

	//character stream, read/write one character
	public void basicOneCharacterReadAndWrite() throws IOException {
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("myfile.txt");
			out = new FileWriter("characteroutput.txt");
			int c;
			while ((c = in.read()) != -1){ 
				out.write(c); 
			}
		} finally {
			if (in != null){ 
				in.close();
			} if (out != null){ 
				out.close();
			} 
		} 
	}

	//Buffered stream
	//BufferedInputStream
	//BufferedOutputStream (create buffered byte streams )
	//BufferedReader
	//BufferedWriter (create buffered character streams )
	//autoflush PrintWriter object flushes the buffer on every invocation of println or format
	public void basicBufferedReadAndWrite() throws IOException {
		BufferedReader   in = null;
		PrintWriter    out = null;
		try {
			in = new BufferedReader(new FileReader("xanadu.txt"));
			out = new PrintWriter(new  FileWriter("characteroutput.txt"));
			String l;
			while ((l = in.readLine()) != null) {
				out.println(l); 
			}
		} finally { 
			if (in != null)
				{ in.close(); } 
			if (out != null)
				{ out.close(); } 
		} 
	}

	//I/O from the command line
	//Memorize!
	public void basicReadAndWriteInCommandLine(){
		System.out.print("Enter your name: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userName = null;
		//  read the username from the command-line;
		try {
			userName = br.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read your name!");
			System.exit(1);
		}
		System.out.println("Thanks for the name, " + userName);
	}


	//ReadATextFile-alternative ways
	//http://stackoverflow.com/questions/4716503/best-way-to-read-a-text-file
	public void ReadAlternative1() throws IOException{
		 BufferedReader br = new BufferedReader(new FileReader("file.txt"));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        String everything = sb.toString();
	    } finally {
	        br.close();
	    }
	}

	//if I want to actually just read a file into a String
	//Apache Common IO - http://www.docjar.com/html/api/org/apache/commons/io/IOUtils.java.html
	public void ReadAlternative2() throws IOException{
		FileInputStream inputStream = new FileInputStream("foo.txt");
	    try {
	        String everything = IOUtils.toString(inputStream);
	    } finally {
	        inputStream.close();
	    }
	}

	//read file using Scanner
	public void ReadAlternative3() throws FileNotFoundException{
		Scanner in = new Scanner(new FileReader("filename.txt"));
	}

}