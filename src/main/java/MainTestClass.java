public class MainTestClass {
    public static void main(String[] args) {
        LinkedNode<Integer> linkedNode = fakeExemple();
        boolean falseCyclicResult = new CoreAlgorithm<Integer>().isCyclic(linkedNode);
        displayResult(falseCyclicResult);

        LinkedNode<Integer> linkedCycleNode = fakeCycleExemple();
        boolean trueCyclicResult = new CoreAlgorithm<Integer>().isCyclic(linkedCycleNode);
        displayResult(trueCyclicResult);
    }

    private static void displayResult(boolean falseCyclicResult) {
        System.out.println(falseCyclicResult ? "Cyclic" : "boof");
    }


    private static LinkedNode<Integer> fakeExemple() {
        LinkedNode<Integer> linkedNode = new LinkedNode<>();
        linkedNode.addNode(5);
        linkedNode.addNode(2);
        linkedNode.addNode(7);
        linkedNode.addNode(5);

        System.out.println(linkedNode);

        return linkedNode;
    }

    private static LinkedNode<Integer> fakeCycleExemple() {
        LinkedNode<Integer> linkedNode = new LinkedNode<>();
        linkedNode.addNode(5);
        linkedNode.addNode(2);
        linkedNode.addNode(7);
        linkedNode.addNode(15, 1);

        System.out.println(linkedNode);

        return linkedNode;
    }
}
