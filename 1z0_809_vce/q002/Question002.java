package com.wealth.certificate.dumps_1z0_809_vce.question002;

import java.io.File;
import java.io.IOException;

public class Question002 {

	public static void main(String[] args) throws IOException {
		Question002 q = new Question002();
//		String filName = "/wmsl-java-certificate/src/main/java/com/wealth/certificate/dumps_1z0_809_vce/question002/classFile";
		q.recDelete(getCurrentPath() + "/classFile");
	}

	public void recDelete(String dirName) throws IOException {
		File[] listOfFiles = new File(dirName).listFiles();	// get all of file in directory (all of file in folder include folder)
		if (listOfFiles != null && listOfFiles.length > 0) {
			for (File aFile : listOfFiles) {
				if (aFile.isDirectory()) {	// if is a Folder (folder id directory) 
					recDelete(aFile.getAbsolutePath());	// then parse the path of folder to self (recursive)
				} else {
					if (aFile.getName().endsWith(".class"))
						aFile.delete();
//						System.out.println("delete '"+aFile.getName()+"' completed status: "+aFile.delete());	// delete file that end with .class
				}
			}
		}
	}
	
	// Not in Question : Addition for get question's properties file path.
	private static String getCurrentPath() {
		return System.getProperty("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809_vce/question002";
	}

}
