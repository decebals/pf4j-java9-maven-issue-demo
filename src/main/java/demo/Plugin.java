package demo;

import org.pf4j.Extension;

@Extension
public class Plugin implements ExtensibleInterface {

  public void demoMethod() {
    System.out.println("demo");
  }

}
