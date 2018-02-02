package demo;

import org.pf4j.Extension;

@Extension
public class MyExtension implements ExtensibleInterface {

    public void demoMethod() {
        System.out.println("demo");
    }

}
