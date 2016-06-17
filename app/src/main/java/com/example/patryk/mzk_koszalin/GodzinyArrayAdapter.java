package com.example.patryk.mzk_koszalin;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kamil on 10.06.2016.
 */
public class GodzinyArrayAdapter extends BaseAdapter {

    private Context context;
    private List<Godziny> godzinyList;

    public GodzinyArrayAdapter(Context context, List<Godziny> godzinyList) {
        this.context = context;
        this.godzinyList = godzinyList;
    }

    @Override

    public int getCount() {
        return godzinyList.size();
    }

    @Override
    public Object getItem(int position) {
        return godzinyList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.list_row, null);

        TextView tvGodzina = (TextView) v.findViewById(R.id.textView4);
        TextView tvMinutaDzienPowszedni = (TextView) v.findViewById(R.id.textViewMinutyDniPowszednie);
        TextView tvMinutaSobota = (TextView) v.findViewById(R.id.textViewMinutySobota);
        TextView tvMinutaSwieta = (TextView) v.findViewById(R.id.textViewMinutySwieta);

        tvGodzina.setText(godzinyList.get(position).getGodzina());
        tvMinutaDzienPowszedni.setText(godzinyList.get(position).getMinutaDniPowszednie());
        tvMinutaSobota.setText(godzinyList.get(position).getMinutaSobota());
        tvMinutaSwieta.setText(godzinyList.get(position).getMinutaSwieta());
        return v;
    }
}
