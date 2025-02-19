import com.jaunt.*;

//Jaunt demo: searches for 'butterflies' at Google and prints urls of search results from first page.

public class Demo {
	public static void main(String[] args) throws JauntException {
		UserAgent userAgent = new UserAgent(); // create new userAgent (headless
												// browser)
		userAgent.settings.autoSaveAsHTML = true;
		userAgent.visit("https://www.udemy.com/blogging-for-money/"); // visit google

		Elements links = userAgent.doc.findEvery("<a>");
		
		
		for (Element link : links)
			System.out.println(link); // print results
	}
}
