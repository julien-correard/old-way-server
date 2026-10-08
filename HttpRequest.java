import java.io.BufferedReader;


public class HttpRequest {
  public String method;
  public String path;
  public String version;

  
  public HttpRequest(BufferedReader reader) throws Exception {
    
    String requestLine = reader.readLine();
    String[] parts = requestLine.split(" ");
    
    method = parts[0];
    path = parts[1];
    version = parts[2];

    String line;
    
    while ((line = reader.readLine()) != null && !line.isEmpty()) {
        
      }
    
}
}