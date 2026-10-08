import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;


public class HttpRequest {
  public String method;
  public String path;
  public String version;
  public Map<String, String> headers = new HashMap<>();

  
  public HttpRequest(BufferedReader reader) throws Exception {
    
    String requestLine = reader.readLine();
    String[] parts = requestLine.split(" ");
    
    method = parts[0];
    path = parts[1];
    version = parts[2];

    String line;
    
    while ((line = reader.readLine()) != null && !line.isEmpty()) {
        int pos = line.indexOf(':');
          // position du premier ":"
        String key = line.substring(0, pos).trim().toLowerCase();
        String data = line.substring(pos +1).trim();     

        headers.put(key,data);
      }
    
}
}