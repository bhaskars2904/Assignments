package com.bhaskar.javaAssignDay7;

/**
 * Creates an Slist object to use iterator
 */
class Slist{
    /**
     * @return String
     */
    public String toString(){
        return "Slist Object";
    }

    /**
     * @return SListIterator
     */
    public SListIterator iterator(){
       return new SListIterator();
    }
}
