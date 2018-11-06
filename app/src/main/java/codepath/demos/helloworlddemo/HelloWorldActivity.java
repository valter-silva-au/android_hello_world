package codepath.demos.helloworlddemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.AppCenter; import com.microsoft.appcenter.analytics.Analytics; import com.microsoft.appcenter.crashes.Crashes;

public class HelloWorldActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
		
		// Microsoft AppCenter integration
		AppCenter.start(getApplication(), "92515aa8-083e-4857-979f-33b378b5f057", Analytics.class, Crashes.class);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hello_world, menu);
		return true;
	}

}
