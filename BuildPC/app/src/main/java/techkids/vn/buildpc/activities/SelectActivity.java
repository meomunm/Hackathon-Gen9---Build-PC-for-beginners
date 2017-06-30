package techkids.vn.buildpc.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import techkids.vn.buildpc.R;
import techkids.vn.buildpc.adapaters.BuildPCAdapter;
import techkids.vn.buildpc.databases.DatabaseHandle;

public class SelectActivity extends AppCompatActivity {
    private final String TAG = SelectActivity.class.toString();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        listView = (ListView) findViewById(R.id.lv_buildPC);
        BuildPCAdapter buildPCAdapter = new BuildPCAdapter(this, R.layout.item_list_build_pc, DatabaseHandle.getInstance(this).getListBuildPC());
        listView.setAdapter(buildPCAdapter);
    }
}
