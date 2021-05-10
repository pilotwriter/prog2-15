package aufgabe15;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GgtIterativ iterativObj = new GgtIterativ();
		//System.out.println(iterativObj.berechneGgt(6, 12));
		//GgtRekursiv recursiveObj = new GgtRekursiv();
		//System.out.println(recursiveObj.berechneGgt(5, 6));

		Measurements mes = new Measurements();
		String a = "a";
		for(int i =0;i<999;i++) {
			mes.measureTimeOfMethod(a);
			a += "a";
		}

	}

}
