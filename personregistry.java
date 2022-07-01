public class personregistry {
	private String num;

	public void perosnregistry(String num){
		this.num = num;
	}

	public String toString(){
		return String.format("The next id to be removed is %d", num);
	}

}