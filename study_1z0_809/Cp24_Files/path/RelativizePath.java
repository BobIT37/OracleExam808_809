package com.wealth.certificate.study_1z0_809.chapter24.path;

import java.nio.file.Path;
import java.nio.file.Paths;

//relativize
public class RelativizePath {
	
	public static void main(String[] args) {
		Path path1 = Paths.get("temp");
		Path path2 = Paths.get("temp/dir1/file.txt");
		Path path1ToPath2 = path1.relativize(path2); // dir1/file.txt
		System.out.println(path1ToPath2);
		
		//If the paths represent two relatives paths without any other information, 
		//they are considered siblings, so you have to go to the parent directory 
		//and then go to the other directory
		Path path3 = Paths.get("dir1");
		Path path3ToPath4 = path3.relativize(Paths.get("dir2")); // ../dir2
		System.out.println(path3ToPath4);
		
		//If both paths are absolute, the result is system-dependent.
		Path path7 = Paths.get("c:\\dir1");
		Path path7ToPath8 = path7.relativize(Paths.get("c:\\dir2")); // ../dir2
		System.out.println(path7ToPath8);
		
		//If one of the paths is an absolute path, a relative path cannot be constructed 
		//because of the lack of information and a llegalArgumentException will be thrown.
		Path path5 = Paths.get("c:\\dir1");
		Path path5ToPath6 = path5.relativize(Paths.get("dir2"));
		System.out.println(path5ToPath6);
	}
	
}
