package il.ac.shenkar.ex4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreateTaskActivity extends Activity 
{
	private DatabaseHandler db;

    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);

        db = DatabaseHandler.getInstance(this);
        final TextView description = (TextView) findViewById(R.id.enter_task);
        final Button newTaskButton = (Button) findViewById(R.id.create_button);
        newTaskButton.setOnClickListener(new View.OnClickListener() 
        {
            @Override
            public void onClick(View view) 
            {
            	db.pushTask(description.getText().toString());
                finish();
            }
        });
    }
}