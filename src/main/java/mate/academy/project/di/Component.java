package mate.academy.project.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Нам надо пометить те классы которые должны быть внедрены
 */
@Retention(RetentionPolicy.RUNTIME )
public @interface Component {
}
