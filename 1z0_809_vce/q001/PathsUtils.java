package com.wealth.certificate.dumps_1z0_809_vce.question001;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsUtils {
	public static Path getPathFromClass(Class c, String resourceName) {
		Path resourcePath = null;
		URL classURL = c.getResource(".");
		try {
			System.out.println(classURL.toURI());
			Path classPath = Paths.get(classURL.toURI());
			resourcePath = classPath.resolve(resourceName);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}	
		//System.out.println("getPathFromClass : "+resourcePath);
		return resourcePath;
	}
}
