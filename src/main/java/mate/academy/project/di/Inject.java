package mate.academy.project.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Этой аннотацией будем помечать поле которое хотим внедрить
 * по умолчанию эти аннотации не ведны для рефлешена,
 * еслимы хотим что бы были видны, мы должны установить
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
}
