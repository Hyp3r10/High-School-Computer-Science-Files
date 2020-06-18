public class Lock
{
    private boolean locked;
    public Lock()
    {
        locked = true;
    }
    public void open()
    {
        locked = false;
    }
    public void close()
    {
        locked = true;
    }
    public boolean amILocked()
    {
        return locked;
    }
    public String toString()
    {
        if(amILocked() == false)
        {
            return "The lock is open"; 
        }
        else// Locked = true
        {
            return "The lock is closed";
        }
    }
}