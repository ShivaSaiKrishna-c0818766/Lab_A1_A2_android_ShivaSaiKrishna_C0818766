package com.example.lab_a1_a2_android_shivasaikrishna_c0818766;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView prodLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initwidgets();
        setProdadapter();

    }

    private void setProdadapter() {
        productAdapter productAdapter= new productAdapter(getApplicationContext(), Product.productArrayList);
        prodLv.setAdapter(productAdapter);
    }

    private void initwidgets() {
        prodLv = findViewById(R.id.productLv);
    }

    public void newProduct(View view) {
        Intent newProductIntent = new Intent(this, productDetailActivity.class);
        startActivity(newProductIntent);
    }
}