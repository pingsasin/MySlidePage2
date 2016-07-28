package th.co.creativeme.myslidepage2;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        TabHost mTabHost = getTabHost();
        mTabHost.addTab(mTabHost.newTabSpec("first").setIndicator("CREDIT CARD").setContent(new Intent(this,FirstActivity.class )));
        mTabHost.addTab(mTabHost.newTabSpec("second").setIndicator("IDENTITY CARD").setContent(new Intent(this , SecondActivity.class )));
        mTabHost.setCurrentTab(0);

    }
}
