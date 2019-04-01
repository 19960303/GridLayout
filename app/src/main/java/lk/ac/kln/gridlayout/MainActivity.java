package lk.ac.kln.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getUserInputs(View view) {
        EditText userWeight = findViewById(R.id.userweight);
        EditText userHeight = findViewById(R.id.userheight);
        TextView result=findViewById(R.id.userBMI);

        //Get user weight as a string
        String uWeight = userWeight.getText().toString();
        //convert user value into double
        double weight = Double.parseDouble(uWeight);
        //Get user id and convert into double
        double height = Double.parseDouble(userHeight.getText().toString());

        double userBMI=calculateBMI(weight,height);
        String bmiString=Double.toString(userBMI);
        result.setText(bmiString);

        //Display BMI in toast
        Toast toast= Toast.makeText(this,bmiString,Toast.LENGTH_LONG);
        toast.show();
    }


    private double calculateBMI(double weight,double height){
        return weight/Math.pow(height,2);


    }
}
