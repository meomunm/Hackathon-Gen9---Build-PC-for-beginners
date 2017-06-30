package techkids.vn.buildpc.databases;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 6/30/2017.
 */

public class DatabaseHandle {
    private MyDatabase myDatabase;

    public DatabaseHandle(Context context) {
        myDatabase = new MyDatabase(context);
    }

    private static DatabaseHandle instance;

    public static DatabaseHandle getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseHandle(context);
        }
        return instance;
    }

    private SQLiteDatabase buildPCDatabase;

    public List<BuildPCModel> getListBuildPC() {
        buildPCDatabase = myDatabase.getReadableDatabase();
        List<BuildPCModel> buildPCModelList = new ArrayList<>();
        Cursor cursor = buildPCDatabase.rawQuery("select * from Cpu", null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {
            String company = cursor.getString(0);
            String specie = cursor.getString(1);
            String socket = cursor.getString(2);
            String speed = cursor.getString(3);
            String igp = cursor.getString(4);
            String ram_support = cursor.getString(5);
            String core = cursor.getString(6);
            String thread = cursor.getString(7);
            String cache = cursor.getString(8);
            String lithography = cursor.getString(9);
            String tdp = cursor.getString(10);
            float price = cursor.getFloat(11);
            String image = cursor.getString(12);

            BuildPCModel buildPCModel = new BuildPCModel(company, specie, socket, speed, igp, ram_support,core, thread, cache, lithography, tdp, price, image);
            buildPCModelList.add(buildPCModel);
            cursor.moveToNext();
        }
        return buildPCModelList;
    }

}
