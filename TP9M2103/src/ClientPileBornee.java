
public class ClientPileBornee {

	public static void main(String[] args) throws FullStack {
		try {
			

//			p.push(11);
//			System.out.println(p.top());
//			p.push(22);
//			System.out.println(p.top());
//			p.push(33);
//			System.out.println(p.top());
//			p.push(44);
//			System.out.println(p.top());
//			p.pop();
//			System.out.println(p.top());
//			p.pop();
//			System.out.println(p.top());
//			p.pop();
//			System.out.println(p.top());
			PileBornee<Character> p = new PileBornee<Character>(9);
			p.push('a');
			p.push('b');
			p.push('r');
			p.push('a');
			p.push('c');
			p.push('a');
			p.push('r');
			p.push('b');
			p.push('a');
			System.out.println(p);
		}
		catch (FullStack e) {
			System.out.println(e);
		}
	}
}
