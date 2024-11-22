package template;

public class Workflow {
    public void runWorkflow() {
        runStep1();
        runStep2();
        runStep3();
        runStep4();
    }

    protected void runStep1() {
        System.out.println("Running step 1");
    }

    protected void runStep2() {
        System.out.println("Running step 2");
    }

    protected void runStep3() {
        System.out.println("Running step 3");
    }

    protected void runStep4() {
        System.out.println("Running step 4");
    }
}
