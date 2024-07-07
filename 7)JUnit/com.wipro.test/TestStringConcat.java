import task.DailyTasks;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestStringConcat {
    
    @Test
    public void testDoStringConcat() {
        DailyTasks tasks = new DailyTasks();
        String result = tasks.doStringConcat("Hello", "World");
        assertEquals("Hello World", result);
    }
}

