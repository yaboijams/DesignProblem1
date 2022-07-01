class Main{
	public static void main(String{} args){
	personregistry p1 = new personregistry(34);
	personregistry p2 = new personregistry(35);
	personregistry p3 = new personregistry(36);


	registry r = new registry();


	r.addnewreg(p1);
	r.addnewreg(p2);
	r.addnewreg(p3);



	System.out.println(r.getNextRemove());
	System.out.println(r.getNextRemove());
	System.out.println(r.getNextRemove());
	}

}