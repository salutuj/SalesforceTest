import com.exacttarget.fuelsdk.*;

public class ETClientTest {
	
	public static void main(String [] args){
		try{		   
			ETClient etClient = new ETClient();
		    System.out.println(etClient.getAccessToken());		
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}
}