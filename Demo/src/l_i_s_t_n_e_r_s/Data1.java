package l_i_s_t_n_e_r_s;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Data1 implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped");
	}
	
	

}
