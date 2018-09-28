package com.wmtbr.xtrack.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wmtbr.xtrack.R;
import com.wmtbr.xtrack.models.PojoDemo;
import java.util.ArrayList;

public class AdapterPojo extends RecyclerView.Adapter<AdapterPojo.ViewHolder>{

    private ArrayList<PojoDemo> dataList;

    public AdapterPojo(ArrayList<PojoDemo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public AdapterPojo.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_principal, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterPojo.ViewHolder holder, int position) {
        dataList.get(position).getCidade();
        dataList.get(position).getHora();
        dataList.get(position).getStatus();
        dataList.get(position).getData();
        dataList.get(position).getUf();
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;

        public ViewHolder(View itemView) {
            super(itemView);

            recyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerView);

        }
    }
}