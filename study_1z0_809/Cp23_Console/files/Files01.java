package com.wealth.certificate.study_1z0_809.chapter23.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Files01 {
	public static void main(String[] args) {
		createPropertyFile();
		File file = new File(getCurrentPath() + "/home/user.properties");
		
		if (file.exists()) {							// file or directory exist
			
			String name = file.getName();				// Name of the file/directory
			
			String parent = file.getParent();			// Path of its parent
			
			long millis = file.lastModified();			// Returning the time the file/directory was modified
														// in milliseconds since 00:00:00 GMT, January 1, 1970

			if (file.isFile()) {						// If the object represents a file
				long size = file.length();				// Returning the size of the file in bytes
				
			} else if (file.isDirectory()) {			// If the object represents a directory
				boolean dirCreated = file.mkdir();		// Returns true only if the directory was created

				boolean dirsCreated = file.mkdirs();	// Returns true only if the directory was created,
														// along with all necessary parent directories

				String[] fileNames = file.list();		// Get all the files/directories in a directory, Just the names
				
				File[] files = file.listFiles();		// As File instances
			}
			boolean wasRenamed = file.renameTo(new File("user2"));	//return true if and only if the renaming succeeded;
			boolean wasDeleted = file.delete();			//return true if and only if the file or directory is successfully deleted
		}
	}

	public static String getCurrentPath() {
		return System.getProperty("user.dir") + "/src/main/java/com/wealth/certificate/study_1z0_809/chapter23/files";
	}

	private static void createPropertyFile() {
		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream(getCurrentPath() + "/home/user.properties");

			// set the properties value
			prop.setProperty("a", "a");
			prop.setProperty("b", "b");
			prop.setProperty("c", "c");

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
