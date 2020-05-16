package com.wealth.certificate.dumps_1z0_809.question058;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class FileThread implements Runnable {
	String fName;

	public FileThread(String fName) {
		this.fName = fName;
	}

	public void run() {
		System.out.println(fName);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();
		Stream<Path> listOfFiles = Files.walk(Paths.get(getCurrentPath()));
		listOfFiles.forEach(line -> {
			executor.execute(new FileThread(line.getFileName().toString())); 	// line n1
		});
		executor.shutdown();
		executor.awaitTermination(5, TimeUnit.DAYS);	// line n2
	}
	
	private static String getCurrentPath() {
		return System.getProperty("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809/question058/Java Projects";
	}
}

/*
The Java Projects directory exists and contains a list of files.
What is the result?
A. The program throws a runtime exception at line n2.
B. The program prints files names concurrently.
C. The program prints files names sequentially.
D. A compilation error occurs at line n1.

Answer: B

Explanation:
	- Executors.newCachedThreadPool() 
	: Creates a thread pool that creates new threads as needed, 
	  but will reuse previously constructed threads when they are available.
	: เป็น Thread pool ที่จะสร้างเพิ่มเมื่อเดิมไม่พอ แต่จะ Reuse ของเก่า ถ้า thread ว่าง
	  
	- executor.shutdown()
	: Initiates an orderly shutdown in which previously submitted tasks are executed, 
	  but no new tasks will be accepted.
	: เมื่อมีการสั่ง Shutdown จะรัน Task ที่สั่ง Executed ไปแล้ว โดยไม่รับ Task ใหม่
	
	- executor.awaitTermination(long timeout, TimeUnit unit)
	: Blocks until all tasks have completed execution after a shutdown request, or the timeout occurs, 
	  or the current thread is interrupted, whichever happens first.
	: รอจนกว่า Task ที่สั่งเสร็จ หรือ รอจนถึง Timeout หรือ thread โดน interrupted
	
	- Files.walk(Path start, FileVisitOption... options) return Stream<Path>
	: This method also iterates over a directory to return a stream whose elements are Path objects 
	  that represent the entries of that directory.
	: จะ iterate ไปใน folder และ sub folder
*/
