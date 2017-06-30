package techkids.vn.buildpc.databases;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by ADMIN on 6/30/2017.
 */

public class MyDatabase extends SQLiteAssetHelper{
    private static final String DATABASE_NAME = "pcs.db";
    private static final int DATABASE_VERSION = 1;

    public MyDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
