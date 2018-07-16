# Thingworx-API
Java wrapper for thingworx api (Tufts CEEO)


# Instantiate and get a Thing
        Thingworx tw = new Thingworx("thing_name");
    
# Get info from property
        System.out.println(tw.getPropertyValue("property_name").getValue());
        System.out.println(tw.getPropertyValue("property_name").getBaseType());
        System.out.println(tw.getPropertyValue("property_name").getCacheTime());
        System.out.println(tw.getPropertyValue("property_name").getDataChangeType());
        System.out.println(tw.getPropertyValue("property_name").getDescription());
        System.out.println(tw.getPropertyValue("property_name").getName());
        System.out.println(tw.getPropertyValue("property_name").getOrdinal());
        System.out.println(tw.getPropertyValue("property_name").toString());
        
# Add property to a thing
        tw.addPropertyToThing("property_name", Type.INTEGER);
        tw.addPropertyToThing("property_name", Type.STRING);
        
# Update property
        tw.updateProperty("property_name", "property_value");
        tw.updateProperty("property_name", 100);
