import template.CustomWorkflow;
import template.Workflow;

public class Main {
    public static void main(String[] args) {
        new Workflow().runWorkflow();
        System.out.println();
        new CustomWorkflow().runWorkflow();
    }
}