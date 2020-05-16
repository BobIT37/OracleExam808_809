package com.wealth.certificate.dumps_1z0_809.question126;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Test
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException
	{		
		Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
		files.forEach(fName -> { // line n1
			try {
				Path aPath = fName.toAbsolutePath(); // line n2
				System.out.println(fName + ":" + Files.readAttributes(aPath, BasicFileAttributes.class /* Wrong : Basic.File.Attributes.class */).creationTime());
				// System.out.println(fName + ":" + Files.readAttributes(aPath, DosFileAttributes.class).creationTime());
				// System.out.println(fName + ":" + Files.readAttributes(aPath, PosixFileAttributes.class).creationTime());
			} catch (IOException ex){
				ex.printStackTrace();
			}
		});
	}

	/**
	 * A. All files and directories under the home directory are listed along with their attributes.
	 * > Correct : Print All files and directories under the home directory
	 * B. A compilation error occurs at line n1.
	 * > No compile errors at line n1.
	 * C. The files in the home directory are listed along with their attributes.
	 * > Incorrect : Not print only files but print directories too.
	 * D. A compilation error occurs at line n2.
	 * > No compile errors at line n2.
	 **/
	
	/** 
	 * BasicFileAttributeView – Provides a view of basic attributes that are required to be supported by all file system implementations.
	 * DosFileAttributeView (Disk Operating System - Windows)
	 * 						– Extends the basic attribute view with the standard four bits supported on file systems that support the DOS attributes.
	 * PosixFileAttributeView (Portable Operating System Interface - Unix, Linux (some version), MacIntosh)
	 * 						– Extends the basic attribute view with attributes supported on file systems that support the POSIX family of standards, such as UNIX. These attributes include file owner, group owner, and the nine related access permissions.
	 * FileOwnerAttributeView – Supported by any file system implementation that supports the concept of a file owner.
	 * AclFileAttributeView (Access Control List)
	 * 						– Supports reading or updating a file's Access Control Lists (ACL). The NFSv4 ACL model is supported. Any ACL model, such as the Windows ACL model, that has a well-defined mapping to the NFSv4 model might also be supported.
	 * UserDefinedFileAttributeView – Enables support of metadata that is user defined. This view can be mapped to any extension mechanisms that a system supports. In the Solaris OS, for example, you can use this view to store the MIME type of a file.
	**/
}
