import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestResutlsLogger implements TestWatcher {
    Log log=new Log();

    @Override
    public void testSuccessful(ExtensionContext context) {
        String testName= context.getDisplayName();
        log.info(testName+" TEST PASSED");
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName= context.getDisplayName();
        String failCause= cause.getMessage();
        log.error(testName+" TEST FAILED because: "+failCause);

    }
}
