package il.co.roeen.blogs.ACTIVITIES;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import il.co.roeen.blogs.R;

public class MainActivity extends BaseActivity {
    public Intent intent;
    private Button btnAddPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();

        btnAddPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to start BlogPostActivity
                intent = new Intent(MainActivity.this, BlogPostActivity.class);
                startActivity(intent); // Start the new activity
            }
        });
    }

    @Override
    protected void initializeViews() {
        btnAddPost = findViewById(R.id.btnAddPost);
        setListeners();
    }

    @Override
    protected void setListeners() {
        // Add listener to btnAddPost
    }
}
