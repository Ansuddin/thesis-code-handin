import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;

// Could not be implemented in Paragon due to missing support of java.lang.Class
public class Mapper {


	public static PatientJournalD JSONToObject(String json) {
		PatientJournalD object = new PatientJournalD();
		try {
			ObjectMapper mapper = new ObjectMapper();
			object = mapper.readValue(json, PatientJournalD.class);
		} catch (Exception e){
			e.printStackTrace();
		}		
		return object;	
	}

	public static String objectToJSON(PatientJournalD object){
		String json = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			 json = mapper.writeValueAsString(object);
			return json;
		} catch (Exception e){
			e.printStackTrace();
		}
		return json;
	}

}