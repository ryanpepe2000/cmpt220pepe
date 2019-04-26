import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Problem4 {
	
	public static void main(String[] args) throws IOException{
		if (args.length != 2) {
			System.out.println("usage: java ClassName String fileName");
			System.exit(1);
		}
		
		File infile = new File(args[1]);
		File outfile = new File("temp.txt");
		PrintWriter pw = new PrintWriter(outfile);
		
		Scanner input = new Scanner(infile);
		while (input.hasNext()) {
			String line = input.nextLine();
			pw.println(line.replaceAll(args[0], ""));
			infile.delete();
			outfile.renameTo(infile);
		}
		
		input.close();
		pw.close();
	}
}
