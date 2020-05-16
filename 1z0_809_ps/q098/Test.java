package com.wealth.certificate.dumps_1z0_809_ps.question098;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test
{
	public static void main(String[] args)
	{
		Path p1 = Paths.get("/Pics/MyPic.jpeg");
		System.out.println (p1.getNameCount() +
		":" + p1.getName(1) +
		":" + p1.getFileName());
		
		/** Answered : C is incorrect, Correct is B because getNameCount() return number of names separated by separator(/). **/
	}
}