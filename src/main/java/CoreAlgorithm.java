public class CoreAlgorithm<E> {

    /*
    Main idea of the algoithm is to have to pointer
    1 - Tortoise that move forward with one step
    2 - Hare that move with two step
     */
    public boolean isCyclic(LinkedNode<E> linkedNode) {
        // init tortoise and hare position
        Node<E> tortoiseNode = linkedNode.getFirstNode();
        Node<E> hareNode = tortoiseNode != null ? tortoiseNode.getNextElt() : null;

        while(hareNode == null) {
            if (tortoiseNode.equals(hareNode)) {
                return true;
            }

            tortoiseNode = computeTortoiseNode(tortoiseNode);
            hareNode = computeHareNode(hareNode);
        }
        return false;

    }

    private Node<E> computeHareNode(Node<E> currentNode) {
        Node<E> fromNode = currentNode.getNextElt();
        return fromNode != null ?
                fromNode.getNextElt() : null;
    }

    private Node<E> computeTortoiseNode(Node<E> currentNode) {
        return currentNode.getNextElt();
    }

}
