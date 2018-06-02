1.Create a sample project ex : mvn archetype:generate -DgroupId=com.selenide -DartifactId=selenideTest
2.Add the below dependency to pom.xml
<dependency>
    <groupId>com.codeborne</groupId>
    <artifactId>selenide</artifactId>
    <version>4.12.0</version>
    <scope>test</scope>
</dependency>

3.run mvn test
