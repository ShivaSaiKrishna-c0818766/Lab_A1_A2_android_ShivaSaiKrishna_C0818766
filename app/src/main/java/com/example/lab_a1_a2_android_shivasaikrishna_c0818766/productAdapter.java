package com.example.lab_a1_a2_android_shivasaikrishna_c0818766;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class productAdapter extends ArrayAdapter<Product> {
    public productAdapter(Context context, List<Product> products)
    {
        super(context, 0 ,products);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Product product = getItem(position);
        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.product_cell,parent,false);
        TextView id = convertView.findViewById(R.id.cellId);
        TextView nam = convertView.findViewById(R.id.cellName);
        TextView des = convertView.findViewById(R.id.cellDesc);
        TextView prc = convertView.findViewById(R.id.cellPrice);
        TextView pNam = convertView.findViewById(R.id.cellProvider);
        TextView pem = convertView.findViewById(R.id.cellEmail);
        id.setText(product.getId());
        nam.setText(product.getName());
        des.setText(product.getDescription());
        prc.setText(product.getDescription());
        pNam.setText(product.getProName());
        pem.setText(product.getEm());



        return convertView;
    }
}
