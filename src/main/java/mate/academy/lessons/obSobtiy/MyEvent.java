package mate.academy.lessons.obSobtiy;

import java.util.EventObject;

public class MyEvent extends EventObject {
    /**
     * тип события
     */
    private Type type = Type.TYPE_1;

    /**
     * Возвращает тип собітия
     */

    public Type getType() {return type; }

    /**
     * Устанавливает типсобытия
     */

    public void setType() {this.type = type; }

    /**
     * Перечисление возможных типов собития
     */
    public enum Type {
        TYPE_1, TYPE_2
    }


    /**
     * Cоздает новое событие
     */
    public MyEvent(Object source, Type type) {
        super(source);
        this.type = type;
    }
}
