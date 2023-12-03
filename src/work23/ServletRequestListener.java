package work23;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.annotation.WebListener;

import java.time.LocalDateTime;
import java.time.LocalTime;
@WebListener
public class ServletRequestListener implements jakarta.servlet.ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println(LocalDateTime.now());
    }
}
