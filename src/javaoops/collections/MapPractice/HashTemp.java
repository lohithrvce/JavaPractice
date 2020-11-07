package javaoops.collections.MapPractice;

class HashTemp {

	int i;
	
	public HashTemp(int i) {
		this.i = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return i+"";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i%9;
	}
}
