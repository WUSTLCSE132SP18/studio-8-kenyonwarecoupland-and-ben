package studio8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountSteps {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner (new File("C:/Users/Ben/git/studio-8-kenyonwarecoupland-and-ben/data/accel.csv"));
		scanner.useDelimiter(",");
		while(scanner.hasNext()) {
			//if ()
			String str =scanner.next();
			double var = Double.parseDouble(str);
			System.out.print(var+"|");
		}
		scanner.close();
		
	}
	
}
// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.
