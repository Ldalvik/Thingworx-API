package thingworx;
import org.json.simple.JSONObject;

public class Thingworx {
    private String thing;

    public Thingworx(String thing){
        this.thing = thing;
    }
    public static void createThing(String name, String description, String thingTemplateName){
        JSONObject obj = new JSONObject();
        obj.put("name", name);
        obj.put("description", description);
        obj.put("thingTemplateName", thingTemplateName);
        Utils.postRequest(
                "http://pp-1804271345f2.portal.ptc.io:8080/Thingworx/Resources/EntityServices/Services/CreateThing",
                obj.toJSONString()
        );
    }

    public Properties getPropertyValue(String property) {
        return new Properties(Utils.getRequest("http://pp-1804271345f2.portal.ptc.io:8080/Thingworx/Things/" + thing + "/Properties/" + property), property);
    }

    public void addPropertyToThing(String name, String type){
        JSONObject obj = new JSONObject();
        obj.put("name", name);
        obj.put("type", type);
        Utils.postRequest("http://pp-1804271345f2.portal.ptc.io:8080/Thingworx/Things/" + thing + "/Services/AddPropertyDefinition", obj.toJSONString());
    }

    public void updateProperty(String property, String value){
        JSONObject obj = new JSONObject();
        obj.put(property, value);
        Utils.putRequest("http://pp-1804271345f2.portal.ptc.io:8080/Thingworx/Things/" + thing + "/Properties/*", obj.toJSONString());
    }

    public void updateProperty(String property, int value){
        JSONObject obj = new JSONObject();
        obj.put(property, value);
        Utils.putRequest("http://pp-1804271345f2.portal.ptc.io:8080/Thingworx/Things/" + thing + "/Properties/*", obj.toJSONString());
    }

    public void restart(){
        Utils.postRequest("http://pp-1804271345f2.portal.ptc.io:8080/Thingworx/Things/" + thing + "/Services/RestartThing");
    }

    public void enable(){
        Utils.postRequest("http://pp-1804271345f2.portal.ptc.io:8080/Thingworx/Things/" + thing + "/Services/EnableThing");
    }
}

