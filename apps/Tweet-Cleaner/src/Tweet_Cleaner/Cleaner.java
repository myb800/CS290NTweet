package Tweet_Cleaner;

import java.io.File;

public class Cleaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		args = new String[]{"C:\\backfile\\cs290n\\tweets\\#KidLegislation.txt","C:\\backfile\\cs290n\\tweets\\#KidLegislation_cleaned.txt"};
		File inputFile = new File(args[0]);
		File outputFile = new File(args[1]);
		RetweetCleaner.cleanRetweet(inputFile, outputFile);
	}

}
