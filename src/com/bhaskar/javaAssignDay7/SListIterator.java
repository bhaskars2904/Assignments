package com.bhaskar.javaAssignDay7;

/**
 * Creates an iterator for performing insertion and deletion
 */
class SListIterator{
    public node prev;
    public node curr;

    /**
     * @param head
     * @param i
     * @param n
     * @param indexvalue
     */
    public void insrtnode(node head, int i, node n, int indexvalue){
        //inserts a node 'n' at i th position with an index value
        curr=head;
        for(int j=1;j<i;j++){
            prev=curr;
            curr=curr.nextnode;
        }
        n.setindex(indexvalue);
        n.nextnode=curr;
        prev.nextnode=n;
    }

    /**
     * @param head
     * @param i
     */
    public void delnode(node head, int i){
        //deletes a node at position i
        curr=head;
        for(int j=1;j<i;j++){
            prev=curr;
            curr=curr.nextnode;
        }
        prev.nextnode=curr.nextnode;
    }
}
