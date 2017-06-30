package techkids.vn.buildpc.adapaters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import techkids.vn.buildpc.R;
import techkids.vn.buildpc.databases.BuildPCModel;

/**
 * Created by ADMIN on 6/30/2017.
 */

public class BuildPCAdapter extends ArrayAdapter<BuildPCModel>{
    private Context context;
    private int resource;
    private List<BuildPCModel> buildPCModelList;

    public BuildPCAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<BuildPCModel> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.buildPCModelList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.item_list_build_pc, null);

        BuildPCModel buildPCModel = buildPCModelList.get(position);

        TextView tvSpecie = (TextView) convertView.findViewById(R.id.tv_specie);
        TextView tvSpeed = (TextView) convertView.findViewById(R.id.tv_speed);
        TextView tvCore = (TextView) convertView.findViewById(R.id.tv_core);
        TextView tvPrice = (TextView) convertView.findViewById(R.id.tv_price);
        ImageView ivImage = (ImageView) convertView.findViewById(R.id.iv_image);

        tvSpecie.setText(buildPCModel.getSpecie());
        tvSpeed.setText(buildPCModel.getSpeed());
        tvCore.setText(buildPCModel.getCore());
        tvPrice.setText(String.valueOf(buildPCModel.getPrice()));

        String image[] = buildPCModel.getImage().split(",");
        byte[] decodeByte = Base64.decode(image[1], Base64.DEFAULT);
        Bitmap bitmap = BitmapFactory.decodeByteArray(decodeByte, 0, decodeByte.length);
        ivImage.setImageBitmap(bitmap);

        return convertView;
    }
}
