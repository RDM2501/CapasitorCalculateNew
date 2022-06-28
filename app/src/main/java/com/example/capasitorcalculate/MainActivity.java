package com.example.capasitorcalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

private TextView adder;
private TextView result_C3;
private TextView log;
private EditText editing_C1;
private EditText editing_C2;
private float edit_C1;
private float edit_C2;
private float Res_C3;
private String res_C3;
private ImageView imageview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adder = findViewById(R.id.textView_Adder);

      /*  int c1 =
        adder.setText(C1);


        adder.setText(C2);*/


    }

    public void confirm_C1(View view) {
        editing_C1 = findViewById(R.id.edit_C1);

        adder.setText("C1="+editing_C1.getText()+" мкФ");
        /*String C1 = editing_C1.getText().toString();*/
    }

    public void confirm_C2(View view) {
        editing_C2 = findViewById(R.id.edit_C2);

        adder.setText("C1="+editing_C1.getText()+" мкФ; "+"C2="+editing_C2.getText()+" мкФ");
        /*String C2 = editing_C2.getText().toString();*/
    }

    public void calculate_C3(View view) {
        /*EditText  editText  = findViewById(R.id.youPasswordLength);
        int passwLength = Integer.parseInt(editText.getText());*/
        float edit_C1 = Float.parseFloat(String.valueOf(editing_C1.getText()));
        float edit_C2 = Float.parseFloat(String.valueOf(editing_C2.getText()));
     float Res = (edit_C1*edit_C2)/Math.abs(edit_C1-edit_C2);
     result_C3 = findViewById(R.id.textViewResult_C3);
     res_C3 = Float.toString(Res);
     result_C3.setText(res_C3+" мкФ");

     log = findViewById(R.id.textView_Log);
     log.setText(res_C3+" мкФ");



          /*  int positon = log.getText(result_C3);*/
            /*String description = getDescriptionByPosition(positon);
            textViewDescriprionTemp.setText(description);


        private String getDescriptionByPosition (int position) {
            String[] descriptions = getDescriptionByPosition(R.id.textViewResult_C3);
            return descriptions[position];
        }*/













        /*float  i = 3.46f;
        String str = Float.toString(i);
        System.out.println(str);*/
        /*imageview = findViewById(R.id.imageView);
        imageview.setImageResource(R.drawable.ic_baseline_mood_24);*/
        /*do {
            imageview.setImageAlpha(0);
        } while (Res == 0);*/
/*if (Res > 0) { imageview.setImageAlpha(0);} else {imageview.setImageAlpha(1);}
if (Res < 0) {imageview.setImageAlpha(1);}*/

    }
}