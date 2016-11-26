package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Javagram {

	public static void main(String[] args) {
		int choice = 0;
		int verify = 0;
		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath = null;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				/*
				String[] relPathParts = relPath.split(File.separator);
				imagePath = dir + File.separator + String.join("\\\\", Arrays.asList(relPathParts));
				*/
				imagePath = (dir + "\\" + relPath);
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		// TODO - prompt user for filter and validate input
		do{
			try{
				System.out.println("Hey, pick a filter:");
				System.out.println("1. Blue Filter");
				System.out.println("2. Green Filter");
				System.out.println("3. Red Filter");
				System.out.println("4. Grayscale Filter");
				System.out.println("5. Invert Filter");
				System.out.println("6. Static Filter");
				System.out.println("7. Brighten Filter");
				System.out.println("8. Do Nothing to Image");
				choice = in.nextInt();
				if(choice < 1 || choice > 8){
					choice = 0;
					System.out.println("Enter a valid integer for selection");
				}
			} catch (InputMismatchException e2) {
					System.out.println("Maybe enter a valid input, which is the integer of the choice you want");
					in.nextLine();
			}
		} while (choice == 0);
		
		
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		Filter filter = getFilter(choice);			

		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} else if (fileName.equals(relPath)){
			do{
				try{
					System.out.println("WARNING: File already exists. Do you want to overwrite? Y/N");
					String decision = in.next();
					if (decision.equals("Y")){
						String absFileName = dir + File.separator + fileName;
						processed.save(absFileName);
						System.out.println("Image saved to " + absFileName);
						verify = 1;
					}
					else {
						if (decision.equals("N")){
								System.out.println("Image not saved");
								verify = 1;
						}
						else{
							System.out.println("Next time type 'Y' for overwrite, or 'N', to not save. Image not saved.");
							in.nextLine();
						}
					}
				
				} catch (InputMismatchException e2) {
						System.out.println("Maybe enter a valid input, which is Y or N");
						in.nextLine();
					}
			} while (verify == 0);
		}
		else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}
		
		// close input scanner
		in.close();
	}
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	private static Filter getFilter(int choice) {
		// TODO - create some more filters, and add logic to return the appropriate one
		if (choice == 1)
			return new BlueFilter();
		if (choice == 2)
			return new GreenFilter();
		if (choice == 3)
			return new RedFilter();
		if (choice == 4)
			return new GrayscaleFilter();
		if (choice == 5)
			return new InvertFilter();
		if (choice == 6)
			return new StaticFilter();
		if (choice == 7)
			return new BrightenFilter();
		else
			return new OriginalFilter();
		
	}

}