package template;

public class CustomWorkflow extends Workflow {
    @Override
    public void runWorkflow() {
        runStep1();
        runStep4();
    }

    @Override
    public void runStep1() {
        System.out.println("Running custom step 1");
    }
}
