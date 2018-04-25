package ro.razvan.githubproject.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import ro.razvan.githubproject.R;
import ro.razvan.githubproject.control.NetworkAPI;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkAPI networkAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final boolean injected= networkAPI != null;

        final TextView target=findViewById(R.id.target);
        target.setText("Dependency injection worked: "+String.valueOf(injected));
    }
}
