package com.wealth.certificate.study_1z0_809.chapter24.path;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizePath {
	
	public static void main(String[] args) {
		// refers to /temp/file.txt
		Path p1 = Paths.get("/temp/./file.txt");
		System.out.println(p1);

		// refers to /temp//file.txt
		Path p2 = Paths.get("/temp/dir1/../file.txt");
		System.out.println(p2);

		Path path1 = p1.normalize();
		System.out.println("normalize current : " + path1);

		Path path2 = p2.normalize();
		System.out.println("normalize parent : " + path2);

		try {
			// - If LinkOption.NOFOLLOW_LINKS is passed as an argument, symbolic links are not
			//   followed (by default it does).
			// - If the path is relative, it returns an absolute path.
			// - It returns a Path with redundant elements removed (if any).
			Path realPath = p2.toRealPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
