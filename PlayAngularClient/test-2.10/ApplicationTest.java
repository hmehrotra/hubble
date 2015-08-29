import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import controllers.Application;
import play.libs.F.Promise;
import play.mvc.Result;
import play.test.FakeApplication;
import play.test.Helpers;
import play.test.WithApplication;

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

	@Test
	public void test() throws InterruptedException {
		Promise<Result> promise = Application.getAllSegments();
		Result result = promise.get(5000, TimeUnit.SECONDS);
		System.out.println(result);
		// assertEquals(OK, result.)
	}
}
