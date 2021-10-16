package com.example.lab_a1_a2_android_shivasaikrishna_c0818766;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class productDetailActivity extends AppCompatActivity {
    private EditText edName, edId,edDesc,edPrc,edPname,edPem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        initwidgets();
    }

    private void initwidgets() {
        edId = findViewById(R.id.edId);
        edName = findViewById(R.id.edNam);
        edDesc = findViewById(R.id.edDesc);
        edPrc = findViewById(R.id.edPrice);
        edPname = findViewById(R.id.edPnam);
        edPem = findViewById(R.id.edEm);
    }

    public void saveProduct(View view) {
        String name = String.valueOf(edName);
        int  id = Integer.valueOf(String.valueOf(edId));
        String des = String.valueOf(edDesc);
        double pr = Double.valueOf(String.valueOf(edPrc));
        String pnm = String.valueOf(edPname);
        String prvem = String.valueOf(edPem);

        int iid = Product.productArrayList.size();
        Product newProduct = new Product(id,name, des, pr, pnm, prvem);
        finish();

    }
}