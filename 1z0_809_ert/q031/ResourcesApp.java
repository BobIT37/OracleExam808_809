package com.wealth.certificate.dumps_1z0_809_ert.question031;

import java.util.ResourceBundle;

public class ResourcesApp {
	
	private static final String PATH_TO_MyClass = "com.wealth.certificate.dumps_1z0_809_ert.question031.MyClass";
	
	public void loadResourceBuddle() {
		ResourceBundle resource = ResourceBundle.getBundle(PATH_TO_MyClass);
		System.out.println(resource.getObject(1));
	}

	public static void main(String[] args) {
		new ResourcesApp().loadResourceBuddle();
	}

}
