package br.com.felipemuniz.estoquedroid.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import br.com.felipemuniz.estoquedroid.R;
import butterknife.Bind;
import butterknife.ButterKnife;

public class ProductActivity extends AppCompatActivity {

    @Bind(R.id.edtId)
    EditText mEdtId;

    @Bind(R.id.edtDescription)
    EditText mEdtDescription;

    @Bind(R.id.edtName)
    EditText mEdtName;

    @Bind(R.id.edtPrice)
    EditText mEdtPrice;

    @Bind(R.id.btnUpdate)
    Button mBtnUpdate;

    @Bind(R.id.btnDelete)
    Button mBtnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        ButterKnife.bind(this);
    }
}
