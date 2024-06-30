package behaviour.interpreter.context;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private String currentSection;
    private Map<String, Map<String, String>> configuration = new HashMap<>();

    public void setCurrentSection(String sectionName) {
        this.currentSection = sectionName;
        this.configuration.putIfAbsent(sectionName, new HashMap<>());
    }

    public void addKeyValue(String key, String value) {
        if (configuration!=null){
            configuration.get(currentSection).put(key,value);
        }
    }
    public Map<String, String> getSection(String sectionName) {
        return configuration.get(sectionName);
    }

    public Map<String, Map<String, String>> getConfiguration() {
        return configuration;
    }

    public void printConfiguration () {
        configuration.forEach( (key, map) -> {
            System.out.println("Section - "+ key);
            map.forEach((k,v)->{
                System.out.println("\t "+ k + " - "+ v);
            });
        });
    }
}
