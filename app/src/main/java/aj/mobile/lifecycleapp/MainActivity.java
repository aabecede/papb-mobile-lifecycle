package aj.mobile.lifecycleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("state", "On Create");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("state", "On Start");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("state", "On Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("state", "On Restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("state", "On Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("state", "On Resume");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("kelas", "PAPB-A");
        Log.d("state", "On Save Instance State");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("state", "On Restore");
        String teksKelas = savedInstanceState.getString("kelas");
        Log.d("show state", teksKelas);
        TextView teksHello = (TextView) this.findViewById(R.id.firstTextView);
        teksHello.setText(teksKelas);
    }
}