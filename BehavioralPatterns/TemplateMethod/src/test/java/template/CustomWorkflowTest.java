package template;

import org.junit.Test;
import org.mockito.Mockito;

public class CustomWorkflowTest {
    @Test
    public void runWorkflow() {
        Workflow workflow = new CustomWorkflow();
        Workflow spyWorkflow = Mockito.spy(workflow);

        spyWorkflow.runWorkflow();

        Mockito.verify(spyWorkflow).runStep1();
        Mockito.verify(spyWorkflow, Mockito.never()).runStep2();
        Mockito.verify(spyWorkflow, Mockito.never()).runStep3();
        Mockito.verify(spyWorkflow).runStep4();
    }
}