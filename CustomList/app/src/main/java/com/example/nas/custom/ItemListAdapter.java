package com.example.nas.custom;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NAS on 11/26/2015.
 */
public class ItemListAdapter extends BaseAdapter {
    private Context context;
    private int layoutresource;
    private ArrayList<ItemList> data = new ArrayList<>();

    public ItemListAdapter(Context context, int layoutresource, ArrayList<ItemList> data) {
        this.context = context;
        this.layoutresource = layoutresource;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

 /*   private class ViewHolder {
        public TextView s1, s2;
        public ImageView img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder = null;
        LayoutInflater minflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = minflater.inflate(R.layout.activity_list, null);
            holder = new ViewHolder();
            holder.s1 = (TextView) convertView.findViewById(R.id.txtItemListTitle);
            holder.s2 = (TextView) convertView.findViewById(R.id.txtItemListSubTitle);
            holder.img = (ImageView) convertView.findViewById(R.id.imgItemList);


        }

        ItemList item = (ItemList) data.get(position);

        System.out.println("this item number is"+ item);

        holder.s1.setText(""+ item.getS());
        holder.s2.setText(""+item.getS1());
        holder.img.setImageResource(item.getImg());
        return convertView;
    }*/



    public class HolderView {
        TextView txtTitle, txtSubtitle;
        ImageView img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View fila = convertView;
        HolderView holder = null;
        if (fila == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            fila = inflater.inflate(layoutresource, parent, false);
            holder = new HolderView();
            holder.txtTitle = (TextView) fila.findViewById(R.id.txtItemListTitle);
            holder.txtSubtitle = (TextView) fila.findViewById(R.id.txtItemListSubTitle);
            holder.img = (ImageView) fila.findViewById(R.id.imgItemList);
            fila.setTag(holder);
        } else {
            holder = (HolderView) fila.getTag();
        }

        ItemList item = (ItemList) data.get(position);
        holder.txtTitle.setText(item.getS());
        holder.txtSubtitle.setText(item.getS1());
        holder.img.setImageResource(item.getImg());

        return fila;
    }


}
