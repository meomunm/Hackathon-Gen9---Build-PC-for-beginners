package techkids.vn.buildpc.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import techkids.vn.buildpc.R;
import techkids.vn.buildpc.databases.DatabaseHandle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.toString();
    private Button btStartBuildPC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btStartBuildPC = (Button)findViewById(R.id.bt_start_build_pc);

        btStartBuildPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectActivity.class);
                startActivity(intent);
            }
        });
    }
}
