public class SharedData 
{
	private int [] array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	private String winnerThread;
	
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}
	
	
	 public synchronized String getWinnerThread() {
        return winnerThread;
	 }

    public synchronized void setWinnerThread(String name) {
        // Set winner only once (first finder)
        if (this.winnerThread == null)
            this.winnerThread = name;
    }

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public int[] getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
