public class Node<E> {
    private final E data;
    private Node<E> nextElt;

    protected Node(E data) {
        this.data = data;
        this.nextElt = null;
    }

    protected E getData() {
        return data;
    }

    protected Node<E> getNextElt() {
        return nextElt;
    }

    protected void setNextElt(Node<E> nextElt) {
        this.nextElt = nextElt;
    }

    @Override
    public boolean equals(Object that) {
        if(!(that instanceof Node)) {
            return false;
        }

        Node<E> thatNode = (Node) that;
        return this.data.equals(thatNode.getData()) && this.getNextElt() == thatNode.getNextElt();
    }


    @Override
    public int hashCode() {
        return this.data.hashCode() + this.getNextElt().hashCode();
    }
}
