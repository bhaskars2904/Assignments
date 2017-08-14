package com.bhaskar.javaAssignDay7;

/**
 * Creates a node with an index field
 */
class node{
    public node nextnode;
    private int index;

    /**
     * @param null
     * @return node
     */
    public node(){
        nextnode=null;
    }

    /**
     * @param i
     */
    public void setindex(int i){                        //index setter
        index=i;
    }
    /**
     *@param null
     * @return index
     */
    public int getindex(){                              //index getter
        return index;
    }
}
