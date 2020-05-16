package com.wealth.certificate.dumps_1z0_809_ert.question058;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Question058 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Path path1 = Paths.get("/software/././sys/readme.txt");
		/*Normalizing means that it removes all the . and .. codes in the middle of the path string*/
		Path path2 = path1.normalize();// \software\sys\readme.txt
		Path path3 = path2.relativize(path1);// ..\..\.\.\sys\readme.txt
		//System.out.println(path3);
		System.out.print(path1.getNameCount());
		System.out.print(":" + path2.getNameCount());
		System.out.print(":" + path3.getNameCount());

	}
}
