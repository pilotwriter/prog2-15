package aufgabe15;

import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.junit.runner.JUnitCore;

import com.sun.net.httpserver.Authenticator.Result;

import TestGgT.AllTestsGgt;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GgtIterativ iterativObj = new GgtIterativ();
		//System.out.println(iterativObj.berechneGgt(6, 12));
		//GgtRekursiv recursiveObj = new GgtRekursiv();
		//System.out.println(recursiveObj.berechneGgt(5, 6));
//		org.junit.runner.Result result = JUnitCore.runClasses(AllTestsGgt.class);
//		for(org.junit.runner.notification.Failure failure : result.getFailures()) {
//			System.out.println(failure.toString());
//		}
				
		Measurements mes = new Measurements();
		String a = "a";
		for(int i =0;i<1000;i++) {
			mes.measureTimeOfMethod(a);
			a += "a";
			
		}

	}

}
