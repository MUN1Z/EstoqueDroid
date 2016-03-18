package br.com.felipemuniz.estoquedroid.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

import br.com.felipemuniz.estoquedroid.R;
import br.com.felipemuniz.estoquedroid.helper.Config;
import br.com.felipemuniz.estoquedroid.helper.RequestHandler;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    //Buttons

    @Bind(R.id.btnRegister)
    Button mBtnRegister;

    @Bind(R.id.btnView)
    Button mBtnView;

    //Edit Texts

    @Bind(R.id.edtName)
    EditText mEdtName;

    @Bind(R.id.edtDescription)
    EditText mEdtDescription;

    @Bind(R.id.edtPrice)
    EditText mEdtPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    //Adding an employee
    private void addEmployee(){

        final String mName = mEdtName.getText().toString().trim();
        final String mDescription = mEdtDescription.getText().toString().trim();
        final String mPrice = mEdtPrice.getText().toString().trim();

        class AddEmployee extends AsyncTask<Void,Void,String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MainActivity.this,"Cadastrando...","Aguarde um momento...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(Config.KEY_NAME,mName);
                params.put(Config.KEY_DESCRIPTION,mDescription);
                params.put(Config.KEY_PRICE,mPrice);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(Config.URL_REGISTER, params);
                return res;
            }
        }

        AddEmployee ae = new AddEmployee();
        ae.execute();
    }

    @OnClick(R.id.btnRegister)
    public void mBtnRegister(View view){

        addEmployee();

    }

    @OnClick (R.id.btnView)
    public void mBtnView(View view){
        Intent mProducts = new Intent(this, ProductsActivity.class);
        startActivity(mProducts);
    }

}