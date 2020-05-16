package com.wealth.certificate.study_1z0_809.chapter25_Files_and_Streams;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class TestFiles {

	public static void main(String[] args) {
		
		System.out.println("----------------- Files.list() --------------- \n");

		try (Stream<Path> stream = Files.list(Paths.get(getCurrentPath()))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n\n------------------------- Files.walk() -----------------------");
		System.out.println("----------------- not set depth of subdirectory --------------- \n");
		
		try (Stream<Path> stream = Files.walk(Paths.get(getCurrentPath()))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\n----------------- set depth of subdirectory = 1 --------------- \n");
		
		try(Stream<Path> stream = Files.walk(Paths.get(getCurrentPath()), 1)) {
		    stream.forEach(System.out::println);
		} catch(IOException e) {
		    e.printStackTrace();
		}
	
		System.out.println("\n\n----------------- set depth of subdirectory = 1 and symbolic links --------------- \n");

		try (Stream<Path> stream = Files.walk(Paths.get(getCurrentPath()), 1, FileVisitOption.FOLLOW_LINKS)) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\n----------------- Files.find() --------------- \n");

		BiPredicate<Path, BasicFileAttributes> predicate = (path, attrs) -> {
			return attrs.isDirectory();
		};
		int maxDepth = 2;
		try (Stream<Path> stream = Files.find(Paths.get(getCurrentPath()), maxDepth, predicate)) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\n----------------- Files.line() --------------- \n");
		try (Stream<String> stream = Files.lines(Paths.get(getCurrentPath() + "/file.txt"))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		try (Stream<String> stream = Files.lines(Paths.get(getCurrentPath() + "/fileNotExist.txt"))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	private static String getCurrentPath()
	{
		return System.getProperty ("user.dir") + "/src/main/java/com/wealth/certificate/study_1z0_809/chapter25_Files_and_Streams/temp";
	}

}
