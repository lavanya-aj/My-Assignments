package assignment.week3.interface_abs;

public abstract class DatabseConnection  {
	public void  connect() {
		System.out.println("cooonect");
		
	}
	public void  disconnect() {
		System.out.println("disconnect()");
		
	}
public void executeUpdate() {
	System.out.println("executeUpdate");
}

}
