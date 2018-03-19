package studio8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountSteps {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner (new File("C:/Users/Ben/git/studio-8-kenyonwarecoupland-and-ben/data/accelNew.csv"));
		scanner.useDelimiter(",");
		int counter = 0;
		int peaks = 0;
		double var = 0;
		double lastVar = 0;
		double last2Var = 0;
		while(scanner.hasNext()) {
			String str =scanner.next();
			last2Var = lastVar;
			lastVar = var;
			var = Double.parseDouble(str);
			//System.out.print(var+"|");
			counter++;
			if (counter == 3) {
				if(lastVar > var && lastVar > last2Var) {
					peaks++;
				}
				counter = 0;
			}
		}
		scanner.close();
		System.out.println(peaks);
	}
	
}
// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.
