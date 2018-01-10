import com.exacttarget.fuelsdk.*;

public class ETClientTest {
	static ETClient etClient;
	
	public static void main(String [] args){
		try{		   
			etClient = new ETClient();
			
			testAccessToken();
			testTriggeredEmail();
		    		
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}

	private static void testAccessToken() {
		System.out.println(etClient.getAccessToken());		
	}

	private static void testTriggeredEmail() throws ETSdkException {
		ETTriggeredEmail email = new ETTriggeredEmail();
		email.setClient(etClient);
	    email.setKey("Finish_365_trigger_test");
		email.send("pablodiablo@mailinator.com");
	}
}