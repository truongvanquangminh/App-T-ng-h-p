package com.example.ktgk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TraiCay> traicayList;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traicayList) {
        this.context = context;
        this.layout = layout;
        this.traicayList = traicayList;
    }

    @Override
    public int getCount() {
        return traicayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen, txtMoTa;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder =new ViewHolder();

            //Ánh xạ view
            holder.txtTen = (TextView) convertView.findViewById(R.id.textviewTen);
            holder.txtMoTa = (TextView) convertView.findViewById(R.id.textviewMoTa);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imageviewHinh);
            convertView.setTag(holder);
        }else  {
            holder = (ViewHolder) convertView.getTag();
        }


        //gán giá trị
        TraiCay traiCay = traicayList.get(position);

        holder.txtTen.setText(traiCay.getTen());
        holder.txtMoTa.setText(traiCay.getMoTa());
        holder.imgHinh.setImageResource(traiCay.getHinh());

        return convertView;
    }
}
