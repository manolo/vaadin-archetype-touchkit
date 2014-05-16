-------------------------------------------------------------------
Vaadin Maven 2 Application Archetype

Authors: Matti Tahvonen
-------------------------------------------------------------------
DESCRIPTION
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
This Maven archetype generates a simple Vaadin application that uses
Vaadin Touchkit as a Maven 2 project.

-------------------------------------------------------------------
USING THE ARCHETYPE:
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
1) Install Maven 2 (see http://maven.apache.org for details)

2) Build the archetype from the source

    In the project root, execute a Maven build as follows.

        mvn clean install

3) Generate the demo project from the archetype as follows:

    mvn archetype:create \
        -DarchetypeGroupId=com.vaadin \
        -DarchetypeArtifactId=vaadin-archetype-touchkit \
        -DarchetypeVersion=4.0.0.alpha3 \
        -DgroupId=your.company \
        -DartifactId=project \
        -DprojectName=MyApp \

4) Build the project.

    In the created project root, execute a Maven build as follows.

        mvn install

-------------------------------------------------------------------
FURTHER INFORMATION
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
Further information on using Vaadin with Maven is available (at the
time of writing) at
http://dev.vaadin.com/wiki/Articles/MavenIntegration .

-------------------------------------------------------------------
