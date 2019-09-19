
public class ClientPileBornee {

	public static void main(String[] args) {
		PileBornee p = new PileBornee(3);
		System.out.println(p);
		p.push(11);
		System.out.println(p);
		p.push(22);
		System.out.println(p);
		p.push(33);
		System.out.println(p);
		p.push(44);
		System.out.println(p);
		p.pop();
		System.out.println(p);
	}

}
