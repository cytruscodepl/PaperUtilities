# Paper Utilities
Basic set of utilities for building PaperMC plugins

Repo: https://repo.poldekdev.pw/#browse/browse:cytruscode


## How to implement

### Gradle (Groovy)
```groovy
repositories {
    maven { url "https://repo.poldekdev.pw/repository/cytruscode-indev/"}
}
dependencies {
    implementation 'pl.cytruscode:ccUtilities:latest'
}
```
### Maven
```xml
<repositories>
    <repository>
        <id>cytruscode-indev</id>
        <url>https://repo.poldekdev.pw/repository/cytruscode-indev/</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>pl.cytruscode</groupId>
        <artifactId>ccUtilities</artifactId>
        <version>latest</version>
    </dependency>
</dependencies>
```