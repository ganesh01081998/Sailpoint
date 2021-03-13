package sailpoint;

import java.io.*;
import java.util.ArrayList;

public class CSVReaderTest {
	public static final String delimiter = ",";

	public static void read(String csvFile) {
		try {
			File file = new File(csvFile);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			ArrayList userNameList = new ArrayList();
			String line = "";
			String[] tempArr;
			int index = 0;
			int record = 0;
			while ((line = br.readLine()) != null) {
				tempArr = line.split(delimiter);
				if (record == 0) {
					for (int i = 0; i < tempArr.length; i++) {
						String string = tempArr[i];
						if (string.equalsIgnoreCase("email")) {
							index = i;
							record++;
							break;
						}
					}
				}
				
				userNameList.add(tempArr[index]);
			}
			System.out.println(userNameList);
			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// csv file to read
		String csvFile = "D:\\AuthEmployees.csv";
		CSVReaderTest.read(csvFile);
	}
}