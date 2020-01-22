package com.example.servicioweb_posteadordedatos.ui.enter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.servicioweb_posteadordedatos.R;
import com.example.servicioweb_posteadordedatos.rest.adapter.MarketAdapter;
import com.example.servicioweb_posteadordedatos.rest.model.Post;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
Button buttonpost;
EditText Edittexttitle ,Edittextdescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitViews();
        buttonpost.setOnClickListener(this);


    }
    private void InitViews(){

        buttonpost=findViewById(R.id.button);
        Edittexttitle=findViewById(R.id.editText);
        Edittextdescripcion=findViewById(R.id.editText2);

    }
     private void PostPosts(){
         MarketAdapter adapter = new MarketAdapter();
         Call<Post> call = adapter.InsertPost(
                 new Post(
                         Edittexttitle.getText().toString(),
                         Edittextdescripcion.getText().toString(),
                         "http://narceaeduplastica.weebly.com/uploads/8/9/2/8/8928253/4044974.jpg?374"

                 ));
         call.enqueue(new Callback<Post>() {
             @Override
             public void onResponse(Call<Post> call, Response<Post> response) {
                 Log.e("response", response.body().toString());
             }

             @Override
             public void onFailure(Call<Post> call, Throwable t) {

             }
         });
     }





     }



