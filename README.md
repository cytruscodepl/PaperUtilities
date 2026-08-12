# Paper Utilities
Basic set of utilities for building PaperMC plugins

Repo: https://repo.poldekdev.pw/#browse/browse:cytruscode


## How to implement

### Gradle (Groovy)
```groovy
repositories {
    maven { url "https://repo.poldekdev.pw/repository/cytruscode/"}
}
dependencies {
    implementation 'pl.cytruscode:ccUtilities:1.0.2'
}
```
### Maven
```xml
<repositories>
    <repository>
        <id>cytruscode-indev</id>
        <url>https://repo.poldekdev.pw/repository/cytruscode/</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>pl.cytruscode</groupId>
        <artifactId>ccUtilities</artifactId>
        <version>1.0.2</version>
    </dependency>
</dependencies>
```
