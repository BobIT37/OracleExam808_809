package com.wealth.certificate.study_1z0_809.chapter24.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

//move, rename
public class MoveRename {
	
	public static void main(String[] args) {
		try {
			String in1 = ReadFile.getCurrentPath() + "\\temp\\dir6\\in1.txt";
			String in2 = ReadFile.getCurrentPath() + "\\temp\\dir6\\in2.txt";
			String move1 = ReadFile.getCurrentPath() + "\\temp\\dir7\\move1.txt";

			Files.move(Paths.get(in1), Paths.get(in2), StandardCopyOption.ATOMIC_MOVE);
			Files.move(Paths.get(in2), Paths.get(move1));
			Files.move(Paths.get(move1), Paths.get(in1), StandardCopyOption.REPLACE_EXISTING);
			
			String dir8 = ReadFile.getCurrentPath() + "\\temp\\dir8";
			String dir9 = ReadFile.getCurrentPath() + "\\temp\\dir9";
			Files.move(Paths.get(dir8), Paths.get(dir9));
			Files.move(Paths.get(dir9), Paths.get(dir8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
