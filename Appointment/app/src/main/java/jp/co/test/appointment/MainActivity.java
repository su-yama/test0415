package jp.co.test.appointment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mikepenz.aboutlibraries.Libs;
import com.mikepenz.aboutlibraries.LibsBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startLicenseActivity();
    }

    //Private Methods

    /**
     * ライセンス画面を表示します。
     */
    private void startLicenseActivity() {
        new LibsBuilder().withAboutVersionShown(true).withAboutIconShown(true).withActivityStyle(Libs.ActivityStyle.LIGHT).start(this);
    }
}
