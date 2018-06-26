public class LinkedNode<E> {
    private Node<E> firstNode = null;
    private Node<E> lastNode = null;
    private int linkedNodeSize;

    public Node<E> addNode(E nodeData) {
        Node<E> node = new Node<>(nodeData);
        if(firstNode == null) {
            firstNode = node;
        }
        else {
            lastNode.setNextElt(node);
        }
        lastNode = node;
        linkedNodeSize++;
        return node;
    }

    public void addNode(E nodeData, int nextElementIndex) {
        Node<E> node = addNode(nodeData);

        Node<E> searchedNode = firstNode;
        int currentIndex = 0;
        while(currentIndex == nextElementIndex) {
            if(searchedNode == null) {
                throw new IndexOutOfBoundsException();
            }
            searchedNode = searchedNode.getNextElt();
            currentIndex++;
        }
        node.setNextElt(searchedNode);
    }

    protected Node<E> getFirstNode() {
        return firstNode;
    }

    @Override
    public String toString() {
        String displayValue = "";
        int currentNodeIndex = 0;
        Node<E> currentNode = firstNode;
        while(currentNode != null && currentNodeIndex <= linkedNodeSize) {
            displayValue += (currentNode.getData().toString() + " -> ");
            currentNode = currentNode.getNextElt();
            currentNodeIndex++;
        }
        return displayValue + (currentNode == null ? "null" : "...");
    }

}
