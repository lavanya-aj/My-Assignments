package assignment.week3.interface_abs;

public class Concret extends DatabseConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Concret db = new Concret();
		 db.connect();
		 db.disconnect();
		 db.executeUpdate();
		 
	}

}
