package com.example.terry.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

private EditText edtname,edtname2;
     private Button display,plsteam1,plsteamb,subteam1,subteam2,cancel;
      private TextView tv_name1, tv_name2, tv_nub, tv_num;

    int inrement = 0;
    int increment = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display =(Button)findViewById(R.id.btnDisplay);
        plsteam1=(Button) findViewById(R.id.btnaddteam1 );
        plsteamb =(Button)findViewById(R.id.btnaddteam2 );
        subteam1=(Button)findViewById(R.id.btnsubteam1 );
        subteam2 =(Button)findViewById(R.id.btnsubteam2 );
        edtname=(EditText)findViewById(R.id.txtname);
        edtname2=(EditText)findViewById(R.id.txtname2);
        tv_name1=(TextView)findViewById(R.id.team1);
        tv_name2=(TextView)findViewById(R.id.team2);
        tv_nub=(TextView )findViewById(R.id.txtscore1);
        tv_num =(TextView)findViewById(R.id.txtscore2);
        cancel=(Button)findViewById(R.id.btnstart);

        display.setOnClickListener(this);
        cancel.setOnClickListener(this);

    }

    public void AddTeam1 (View v)
    {
        inrement = ++inrement;
        tv_nub.setText("" + inrement);
    }

    public void Subteam1(View v)
    {if (inrement == 0) {
        return;

    }
        inrement = inrement -1;
        tv_nub.setText("" + inrement);


        }

    public  void Addteam2 (View v)
    {
      increment = ++ increment;
        tv_num.setText("" + increment);

    }

    public  void Subteam2 (View v)

    {if (increment == 0) {
           return;

        }
        increment =  increment -1;
        tv_num.setText("" + increment);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnDisplay){
            String team1 = edtname.getText().toString();

            tv_name1.setText(team1);


            String team2 = edtname2.getText().toString();
            tv_name2.setText(team2);


            String scores= tv_nub.getText().toString();

             String score=tv_num.getText().toString();

        }
        else if(v.getId()==R.id.btnstart){
            inrement = 0;
            tv_nub.setText(("" + inrement));


            increment=0;
            tv_num.setText("" + increment);

            tv_name1.setText("");
            tv_name2.setText("");
            edtname2.setText("");
            edtname.setText("");

        }
    }
}

