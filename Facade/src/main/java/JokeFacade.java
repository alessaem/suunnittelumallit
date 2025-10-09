import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JokeFacade {
    public String getAttributeFromJson(String urlString, String attributeName)
            throws IllegalArgumentException, IOException {
            String jsonResult = getJsonFromApi(urlString);
            return parseJson(jsonResult, attributeName);
    }

    private String getJsonFromApi(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } finally {
            con.disconnect();
        }
    }

    private String parseJson(String json,String attributeName) throws IllegalArgumentException {
        try{
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(json);
            if(!jsonObject.containsKey(attributeName)){
                throw new IllegalArgumentException(attributeName+" not found");
            }
            Object obj = jsonObject.get(attributeName);
            return obj.toString();
        }catch(ParseException e){
            throw new IllegalArgumentException("JSON parse error");
        }

    }
}
