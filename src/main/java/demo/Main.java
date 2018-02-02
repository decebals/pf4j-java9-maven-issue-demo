package demo;

import org.pf4j.*;

public class Main {

  private static final PluginManager pluginManager = new DefaultPluginManager();

  public static void main(String[] args) {
    Plugin plugin = (Plugin) pluginManager.getExtensions(ExtensibleInterface.class).get(0);
    plugin.demoMethod();
  }

}
