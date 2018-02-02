This repository is a minimal example of a failing maven build for the following
configuration:

* macOS High Sierra
* java 9.0.4
* maven 3.5.0
  * maven-compiler-plugin 3.7.0
* pf4j 2.1.0


IntelliJ on Java 9.0.4 will compile the problem and
run the demo.Main#main method without problems, so I would guess this is
somewhat related to maven/maven-compiler-plugin.

```
$ mvn clean compile

[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building Demo 0.1.0
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ demo ---
[INFO] Deleting /Users/kvn/Projects/Code/demo/target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/kvn/Projects/Code/demo/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to /Users/kvn/Projects/Code/demo/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] /Users/kvn/Projects/Code/demo/target/classes/META-INF/extensions.idx
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.437 s
[INFO] Finished at: 2018-02-02T01:22:57+01:00
[INFO] Final Memory: 12M/42M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.7.0:compile (default-compile) on project demo: Compilation failure
[ERROR] /Users/kvn/Projects/Code/demo/target/classes/META-INF/extensions.idx
[ERROR]
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```
