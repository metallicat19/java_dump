package currencycalculator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Extractor {

	private String url;
	private Document doc;
	private Element content;
	private Elements valElements;

	private double val;

	public Extractor(String url, String contentId, String elementClass) {
		this.url = url;
		iniConnectAll(contentId, elementClass);
	}

	protected void update(String contentId, String elementClass) {
		iniConnectAll(contentId, elementClass);

	}

	protected void iniConnectAll(String contId, String elementClass) {
		try {
			this.doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			// TODO: handle exception
		}
		content = doc.getElementById(contId);// get content by id from doc

		valElements = content.getElementsByClass(elementClass);// get value element by class ex: (<span
																// class="-d3_d3_x19">)
		val = Double.valueOf(valElements.text().replace(',', '.'));
	}

	protected double getVal() {
		return val;

	}

	protected double getUpdatedVal(String contentId, String elementclass) {
		update(contentId, elementclass);
		return val;

	}
}
