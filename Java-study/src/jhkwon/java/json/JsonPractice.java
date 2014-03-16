package jhkwon.java.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map.Entry;

public class JsonPractice {
	final private String path = "json/"; //set directory path
    private JsonParser parser = new JsonParser();
    private int count = -1;

    public static void main(String[] args){
    	JsonPractice js = new JsonPractice();
    	js.jsonArrayAndObject();
    }
    //https://sites.google.com/site/gson/gson-user-guide

    //http://blog.naver.com/PostView.nhn?blogId=chucc1970&logNo=40155422038&redirect=Dlog&widgetTypeCall=true
    public void jsonArrayAndObject(){
    	JsonObject js = new JsonObject();
    	js.addProperty("FacebookID","lFbID");
    	js.addProperty("AppID","ETZ_SERVICE_NO");
    	String szJsonData = js.toString();
    	System.out.println(szJsonData);

    	JsonArray sendJsonArray = new JsonArray();
    	for (int i=0;i<5;i++){
    		String temp="random";

    		JsonObject sendJsonObject = new JsonObject();
    		sendJsonObject.addProperty("fbFriendsID",temp);
    		sendJsonArray.add(sendJsonObject);
    	}
    	String szJsonData2 = sendJsonArray.toString();
    	System.out.println(szJsonData2);
    }

	private void sendJSONFile() {

        File[] jsonfiles = getJSONFiles();

        if (jsonfiles.length > 0) {
            for (int i = 0; i <= count; i++) {

                try {
                    //prints json file names
                    System.out.println("File: \t" + jsonfiles[i]);
                    JsonElement jsonElement = parser.parse(new FileReader(jsonfiles[i]));
                    JsonObject jsonObject = jsonElement.getAsJsonObject();
                    readJSONFile(jsonObject);
                }
                catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                    //e.getStackTrace();
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                    //e.getStackTrace();
                }

            }
        }
    }

    //read a complete json file
    private void readJSONFile(JsonObject jsonObject) {

        for (Entry<String, JsonElement> entry : jsonObject.entrySet()) {

            String key = entry.getKey();
            JsonElement value = entry.getValue();

            if (value.isJsonObject()) {
                readJSONFile(value.getAsJsonObject());
            }
            else if (value.isJsonArray()) {
                 JsonArray jsonArray = value.getAsJsonArray();
            
                 if (jsonArray.size() == 1) {
                    readJSONFile((JsonObject) jsonArray.get(0));
                }
                 else {
                    //prints json array name
                    System.out.println(key);
                    Iterator<JsonElement> msg = jsonArray.iterator();
                    while (msg.hasNext()) {
                        ////prints json array values
                        System.out.println(msg.next());
                    }
                }
            }
            else {
                ////prints json object's keys and values
                System.out.println(key + " - " + value);
            }
        }
    }

    //get only .json files from a directory
    private File[] getJSONFiles() {

        File folder = new File(path);
        File[] files = folder.listFiles();
        File[] jsonfiles = new File[files.length];

        for (int i = 0; i < files.length; i++) {

            if (files[i].isFile()) {
                if (files[i].getName().endsWith(".json") || files[i].getName().endsWith(".JSON")) {
                    jsonfiles[++count] = files[i];
                }
            }
        }

        return files;
    }	
}