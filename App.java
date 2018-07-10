package thingworx;

public class App 
{
    public static void main( String[] args )
    {
        Thingworx tw = new Thingworx("thing_name");
        System.out.println(tw.getPropertyValue("property_name").getValue());
        System.out.println(tw.getPropertyValue("property_name").getBaseType());
        System.out.println(tw.getPropertyValue("property_name").getCacheTime());
        System.out.println(tw.getPropertyValue("property_name").getDataChangeType());
        System.out.println(tw.getPropertyValue("property_name").getDescription());
        System.out.println(tw.getPropertyValue("property_name").getName());
        System.out.println(tw.getPropertyValue("property_name").getOrdinal());
        System.out.println(tw.getPropertyValue("property_name").toString());
        tw.addPropertyToThing("property_name", Type.STRING);
        tw.updateProperty("property_name", "property_value");
        tw.addPropertyToThing("property_name", Type.INTEGER);
        tw.updateProperty("property_name", 100);
    }
}
