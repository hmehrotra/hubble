import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import play.core.j.JavaResultExtractor;
import play.libs.F.Promise;
import play.mvc.Result;
import play.test.FakeApplication;
import play.test.Helpers;
import play.test.WithApplication;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;

import controllers.Application;

/**
 * Unit test of controllers
 * 
 * @author harshitmehrotra
 */
public class ApplicationTest extends WithApplication {
	
	@Override
	protected FakeApplication provideFakeApplication() {
	  return new FakeApplication(new java.io.File("."), Helpers.class.getClassLoader(),
	      ImmutableMap.of("play.http.router", "router.Routes"), new ArrayList<String>(), null);
	}
	
	private HashMap<String, Object> extractMapFromJson(String input) throws JsonParseException, JsonMappingException, IOException{
		JsonFactory factory = new JsonFactory();
		ObjectMapper mapper = new ObjectMapper(factory);
		TypeReference<HashMap<String,Object>> typeRef = new TypeReference<HashMap<String, Object>>() {};
		
		return mapper.readValue(input, typeRef);
	}

	@Test
	public void entityBrowseTest() throws InterruptedException, JsonParseException, JsonMappingException, IOException {
		Promise<Result> promise = Application.getAllSegments();
		
		// Wait for result
		// Now this makes this test blocking, 
		// but this is just to test that MusicBrainz web service returns data
		Result result = promise.get(20, TimeUnit.SECONDS);
		
		byte[] responseBody = JavaResultExtractor.getBody(result, 0l);
		assertNotNull(responseBody);
		
		String header = JavaResultExtractor.getHeaders(result).get("Content-Type");
		assertEquals(header, "application/json; charset=utf-8");
		
		String charset = "utf-8";
		if(header != null && header.contains("; charset=")){
		    charset = header.substring(header.indexOf("; charset=") + 10, header.length()).trim();
		}
		
		String bodyStr = new String(responseBody, charset);
		HashMap <String, Object> map = extractMapFromJson(bodyStr);

		@SuppressWarnings("rawtypes")
		ArrayList artists = (ArrayList) map.get("artists");
		assertTrue(artists.size() > 0);

		for (Object artist : artists){
			@SuppressWarnings("unchecked")
			Map< String, Object> artistMap = (HashMap<String, Object>) artist;
			System.out.println("Id:" + artistMap.get("id") + " Name: " + artistMap.get("name"));
		}
	}
}
