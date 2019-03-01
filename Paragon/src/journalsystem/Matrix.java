
import org.jpy.PyObject; 
public interface Matrix {
	public void login(String user, String pass);

	public PyObject join(String roomId);

	public void send(String message, String roomString);

	public String retrieve(String roomString);

	//Unused
	public void invite(String userId);

}