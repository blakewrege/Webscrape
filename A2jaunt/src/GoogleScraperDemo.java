import com.jaunt.*;

//Jaunt demo: searches for 'butterflies' at Google and prints urls of search results from first page.

public class GoogleScraperDemo {
	public static void main(String[] args) throws JauntException {
		UserAgent userAgent = new UserAgent(); // create new userAgent (headless
												// browser)
		userAgent.settings.autoSaveAsHTML = true;
		userAgent.visit("http://google.com"); // visit google
		userAgent.doc.apply("butterflies"); // apply form input (starting at
											// first editable field)
		userAgent.doc.submit("Google Search"); // click submit button labelled
												// "Google Search"

		Elements links = userAgent.doc.findEvery("<h3 class=r>").findEvery("<a>"); // find
																					// search
																					// result
																					// links
		for (Element link : links)
			System.out.println(link.getAt("href")); // print results
	}
}
