public class LinkedNode<E> {
    private Node<E> firstNode = null;
    private Node<E> lastNode = null;

    public void addNode(E nodeData) {
        Node<E> node = new Node<>(nodeData);
        if(firstNode == null) {
            firstNode = node;
        }
        else {
            lastNode.setNextElt(node);
        }
        lastNode = node;
    }

    protected Node<E> getFirstNode() {
        return firstNode;
    }

}
