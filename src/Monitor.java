public class Monitor
{
//    private data member of Monitor class (size)
    private int size;
//    parameterized constructor
    public Monitor(int size)
    {
        this.size = size;
    }
//    getter function
    public int getSize()
    {
        return size;
    }
//    setter function
    public void setSize(int size)
    {
        this.size = size;
    }
//    remove function to change the size pf screen to zero (0)
    public void remove()
    {
        size = 0;
    }
}

