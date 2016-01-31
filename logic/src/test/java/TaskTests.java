
import com.pluralsight.logic.Task;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class TaskTests {

    @Test
    public void shouldHaveAName() {
        final String testName = "Tam";
        Task task = new Task();
        task.setName(testName);
        assertThat(task.getName()).isEqualTo(testName);
    }
}
