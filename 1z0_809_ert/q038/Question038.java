package com.wealth.certificate.dumps_1z0_809_ert.question038;

import java.util.Locale;
import java.util.ResourceBundle;

public class Question038 {

	public static void main(String[] args) {
		Locale currentLocale;
		// line 1
		/* A --> wrong
		 * The method getInstance(BaseLocale, LocaleExtensions) 
		 * in the type Locale is not applicable for the arguments (Locale, Locale) 
		 */
		//currentLocale = Locale.getInstance(Locale.GERMAN,Locale.GERMANY) ;
		
		/* B --> wrong 
		 * Cause Locale.GERMAN --> createConstant("de", "")
		 * Cause Locale.GERMANY --> createConstant("de", "DE")
		 * Fixed by using --> currentLocale = Locale.GERMANY
		 */ 
		//currentLocale = Locale.GERMAN; 
		
		/* C --> correct
		 * add .build() to return Locale class
		 */
//		currentLocale = new Locale.Builder().setLanguage("de").setRegion("DE").build();
		
		/* D --> correct
		 * new Locale(String language,String country)
		 */
		currentLocale = new Locale("de","DE");
		
		/* E --> wrong
		 * 
		 *
		currentLocale = new Locale(); // no no-args constructor
		currentLocale.setLanguage("de"); // no method, must use Builder instead
		currentLocale.setRegion("DE"); // no method, must use Builder instead
		 */
		
		ResourceBundle messages = ResourceBundle.getBundle(getPackagePath()+".MessagesBundle", currentLocale);
		System.out.println(messages.getString("inquiry"));
	}
	
	private static String getPackagePath(){
		return "com.wealth.certificate.dumps_1z0_809_ert.question038";
	}
	
}
