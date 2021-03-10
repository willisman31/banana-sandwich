package logic;
/**
 * Display formatted time.
 * @author Willis
 * Updated 3/5/2021
 */
public class TimeDisplay {

	private int length;
	
	/**
	 * Default constructor.
	 */
	TimeDisplay() {
		this.length = 0;
	}
	
	/**
	 * Get formatted time.
	 * @return String of formatted time.
	 */
	public String getTime() {
		int hours = this.length / 3600;
		int minutes = this.length / 60;
		int seconds = this.length;
		String temp = "";
		if (this.length >= 3600) {
			temp += hours + ":";
		}
		temp += minutes + ":" + seconds;
		return temp;
	}
	
	/**
	 * Get formatted time.
	 * @param length in seconds.
	 * @return String of formatted time.
	 */
	static String getTime(int length) {
		int hours = length / 3600;
		int minutes = length / 60;
		int seconds = length;
		String temp = "";
		if (length >= 3600) {
			temp += hours + ":";
		}
		temp += minutes + ":" + seconds;
		return temp;
	}
	
	/**
	 * Length getter.
	 * @return length in seconds.
	 */
	public int getLength() {
		return this.length;
	}
	
	/**
	 * Default print statement.
	 */
	@Override
	public String toString() {
		String temp = getTime(this.getLength());
		return temp;
	}
	
}
