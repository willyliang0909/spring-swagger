
http://localhost:8080/v3/api-docs

http://localhost:8080/swagger-ui/index.html

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>
```

---

```java
@Controller
public class SwaggerRedirectController {

    @GetMapping(value = { "/", "/swagger-ui", "/swagger-ui/" })
    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    public RedirectView redirect() {
        return new RedirectView("/swagger-ui/index.html");
    }
}
```