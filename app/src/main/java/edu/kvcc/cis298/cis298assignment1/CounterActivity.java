//Jordan Koehler, CIS298 MW 2:30-4:45
//September 25th, 2016

package edu.kvcc.cis298.cis298assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends AppCompatActivity {

    private TextView mCounterText;
    private Button mPlusButton;
    private Button mMinusButton;

    private int counterInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //This method is called on the app starting up. I don't currently have it set up to save anything properly.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        mCounterText= (TextView) findViewById(R.id.counter_text_view); //Sets the text for the counter

        mCounterText.setText(Integer.toString(counterInt));

        mPlusButton= (Button) findViewById(R.id.plus_button); // Sets up the design of the Plus Button

        mPlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // Sets the plus button functionality. Increments the counter and does a check to see if the counter has gone beyond 20.
                counterInt++;

                mCounterText.setText(Integer.toString(counterInt));

                if(counterInt == 21) {
                    Toast.makeText(CounterActivity.this,
                            R.string.counter_threshold_toast,Toast.LENGTH_SHORT).show();
                }
            }
        });


        mMinusButton= (Button) findViewById(R.id.minus_button); // Sets the design of the minus button

        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // Sets the minus button functionality. Really just decrements the counter.
                counterInt--;

                mCounterText.setText(Integer.toString(counterInt));
            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
