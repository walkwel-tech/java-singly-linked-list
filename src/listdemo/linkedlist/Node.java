package listdemo.linkedlist;


class Node
{
    protected int data;
    protected Node link;
 
    
    public Node()
    {
        link = null;
        data = 0;
    }    

    /**
     * Parameterized Constructor
     * @param data  Current Node's Data
     * @param link  Next Node
     */
    public Node(int data,Node link)
    {
        this.data = data;
        this.link = link;
    }    
    /*  Function to set link to next Node  */
    public void setLink(Node link)
    {
        this.link = link;
    }    
    /*  Function to set data to current Node  */
    public void setData(int data)
    {
        this.data = data;
    }    
    /*  Function to get link to next node  */
    public Node getLink()
    {
        return this.link;
    }    
    /*  Function to get data from current Node  */
    public int getData()
    {
        return this.data;
    }
}