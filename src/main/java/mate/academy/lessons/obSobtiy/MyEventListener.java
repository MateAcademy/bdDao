package mate.academy.lessons.obSobtiy;

import java.util.EventListener;

public interface MyEventListener extends EventListener {
    void processEvent(MyEvent event);
}
