package com.bhaskar.javaAssignDay7;

/**
 * This program demonstrates a list iterator's
 * insertion and deletion of a node in link list.
 * It uses a node, list and a list iterator object.
 */
public class LinkList {
    public static void main(String[] args) {
        Slist obj=new Slist();
        node head=new node();
        head.setindex(1);                           //index = position(begin at1)
        node thisnode =head;
        for(int i=1;i<5;i++){                       //five nodes
            thisnode.nextnode = new node();
            thisnode.nextnode.setindex(i+1);
            thisnode = thisnode.nextnode;
        }
        obj.iterator().insrtnode(head, 2, new node(), 20);
        //insert node of index= 20 at 2nd position
        obj.iterator().delnode(head, 4);
        //delete node at fourth position of modified list
        thisnode=head;
        while(thisnode!=null){
            System.out.println(thisnode.getindex());
            thisnode=thisnode.nextnode;
        }
    }
}
