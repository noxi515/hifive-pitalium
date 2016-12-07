# Pitalium

Libraries for supporting regression testing of Web applications on multiple browsers and devices 
using Selenium Grid (https://github.com/SeleniumHQ/selenium/wiki/Grid2) and Appium (http://appium.io/) .

This product is licensed under the Apache License, Version 2.0.  
[http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Our developer site is located at  
[http://www.htmlhifive.com](http://www.htmlhifive.com)

Let's hifive !


----------------------------------------------

# Maven repository support (by noxi515)

## Usage

Add repository URL `https://raw.github.com/noxi515/hifive-pitalium/mvn-repo/` like below.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>jp.noxi</groupId>
    <artifactId>pitalium-test</artifactId>
    <version>1.0-SNAPSHOT</version>

    <repositories>
        <repository>
            <id>pitalium</id>
            <url>https://raw.github.com/noxi515/hifive-pitalium/mvn-repo/</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.htmlhifive</groupId>
            <artifactId>pitalium</artifactId>
            <version>1.1.1</version>
        </dependency>
    </dependencies>

</project>
```
