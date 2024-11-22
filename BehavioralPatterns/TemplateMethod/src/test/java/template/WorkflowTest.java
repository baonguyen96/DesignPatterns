package template;

import org.junit.Test;
import org.mockito.Mockito;

public class WorkflowTest {
    @Test
    public void runWorkflow() {
        Workflow workflow = new Workflow();
        Workflow spyWorkflow = Mockito.spy(workflow);

        spyWorkflow.runWorkflow();

        Mockito.verify(spyWorkflow).runStep1();
        Mockito.verify(spyWorkflow).runStep2();
        Mockito.verify(spyWorkflow).runStep3();
        Mockito.verify(spyWorkflow).runStep4();
    }
}