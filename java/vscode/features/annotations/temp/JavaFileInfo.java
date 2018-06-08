
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JavaFileInfo {
    String author() default "unknown";
    String version() default "0.0";
}