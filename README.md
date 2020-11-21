# 


<h1 align="center">
  <br>
Throwable Optional
  <br>
</h1>
<h4 align="center"> Java utility class that enables the possibility to use the Optional with functions that can throw exceptions

<p align="center">
  <a href="https://github.com/brandonfl/throwable-optional/packages/"><img src="https://img.shields.io/github/v/release/brandonfl/throwable-optional" alt="release"></a>
  <a href="https://github.com/brandonfl/throwable-optional/actions?query=workflow%3A%22Java+CI%22"><img src="https://github.com/brandonfl/throwable-optional/workflows/Java%20CI/badge.svg" alt="Java CI"></a>
  <a href="https://github.com/brandonfl/throwable-optional/actions?query=workflow%3ASonar"><img src="https://github.com/brandonfl/throwable-optional/workflows/Sonar/badge.svg" alt="Sonar"></a>
  <a href="https://github.com/brandonfl/throwable-optional/actions?query=workflow%3A%22Publish+Maven+package%22"><img src="https://github.com/brandonfl/throwable-optional/workflows/Publish%20Maven%20package/badge.svg" alt="Publish Maven package"></a>
  <a href="https://sonarcloud.io/dashboard?id=brandonfl_throwable-optional"><img src="https://sonarcloud.io/api/project_badges/measure?project=brandonfl_throwable-optional&metric=alert_status" alt="Sonar gate"></a>
  <a href="https://github.com/brandonfl/throwable-optional/blob/master/LICENSE"><img src="https://img.shields.io/github/license/brandonfl/throwable-optional" alt="licence"></a>
</p>

<p align="center">
  <a href="#how-to-use">How to use</a> •
  <a href="#variables">Variables</a> •
  <a href="#licence">Licence</a> 
</p>

## How to use
#### Installation
```xml
<dependency>
  <groupId>xyz.brandonfl</groupId>
  <artifactId>throwable-optional</artifactId>
  <version>VERSION</version>
</dependency>
```

```sh
mvn install
```
More informations : https://github.com/brandonfl/throwable-optional/packages/

#### Examples

```java
public static void main(String[] args){
    long valueWithTest = ThrowableOptional
            .of(() -> Long.parseLong("test"))
            .orElse(0L);

    long valueWith1 = ThrowableOptional
            .of(() -> Long.parseLong("1"))
            .orElse(0L);

    long valueWithFunction = ThrowableOptional
            .of(Long::parseLong, "1")
            .orElse(0L);

    System.out.println(valueWithTest);
    System.out.println(valueWith1);
    System.out.println(valueWithFunction);
}
```

That will return without exceptions : 
```
0
1
1
```


## Licence

Project under [MIT](https://github.com/brandonfl/throwable-optional/blob/master/LICENSE) licence
