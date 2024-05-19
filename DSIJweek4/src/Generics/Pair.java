package Generics;

public class Pair<TBD, TBD2> {
	private TBD first;
	private TBD2 second;
	
	public Pair(TBD first, TBD2 second){
		this.first= first;
		this.second= second;
	}
	public TBD getfirst() {
		return first;
	}
	public TBD2 getsecond() {
		return second;
	}

}
