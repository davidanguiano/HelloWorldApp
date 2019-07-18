package io.davidanguiano.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void buttonIsClicked(View buttonView) {
        int result = 5 * 5;

        /* i = info
         * d = debug
         * e = error
         */
        // Display the result by searching "OPERATION" in the 'Logcat'
        Log.i("OPERATION", Integer.toString(result));

        // Display in the 'Logcat' the text of the 'TextView'
        TextView textView = (TextView) findViewById(R.id.textView);
        Log.i("TEXTVIEW", textView.getText().toString());

        // Display in the 'Logcat' the text entered by the user in the 'EditTextView'
        EditText editText = (EditText) findViewById(R.id.editTextView);
        Log.i("TXTNAME", editText.getText().toString());

        // Display in the 'Logcat' the text entered by the user in the 'EditTextPHONEView'
        EditText editTextPhone = findViewById(R.id.editTextPhoneView);
        Log.i("TXTPHONE",  editTextPhone.getText().toString());

        // Display a Toast Message
        String strToast = "Your name is: " + editText.getText().toString() + "\n" +
                "Your phone is: " + editTextPhone.getText().toString();
        Toast.makeText(MainActivity.this, strToast, Toast.LENGTH_SHORT).show();

        // Replace the image displayed in the ImageView
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.car);
    }
}
