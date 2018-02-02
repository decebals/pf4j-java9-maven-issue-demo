package demo;

import org.pf4j.DefaultPluginManager;
import org.pf4j.PluginManager;

public class Main {

    public static void main(String[] args) {
        PluginManager pluginManager = new DefaultPluginManager();
        ExtensibleInterface extension = pluginManager.getExtensions(ExtensibleInterface.class).get(0);
        extension.demoMethod();
    }

}
