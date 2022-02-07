package com.example.team_project_mpti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    MyAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    EditText etText;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);


        Button btnFinish = (Button) findViewById(R.id.btnFinish);
        btnSend = (Button) findViewById(R.id.btnSend);
        etText=(EditText) findViewById(R.id.etText);



        btnFinish.setOnClickListener((v)->{finish();});

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        //높이가 가변적이지 않아야 성능이 좋다는 뜻
        recyclerView.setHasFixedSize(true);

        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        String[] myDataset={"test1","test2","test3"};
        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stText = etText.getText().toString();
                Toast.makeText(ChatActivity.this, "MSG: "+stText, Toast.LENGTH_LONG).show();
            }
        });
    }
}