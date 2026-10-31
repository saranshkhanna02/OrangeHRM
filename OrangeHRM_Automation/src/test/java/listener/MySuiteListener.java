package listener;

import org.testng.ISuiteListener;

public class MySuiteListener implements ISuiteListener {
    @Override
    public void onStart(org.testng.ISuite suite) {
        System.out.println("Suite started: " + suite.getName());
    }

    @Override
    public void onFinish(org.testng.ISuite suite) {
        System.out.println("Suite finished: " + suite.getName());
    }
}
