package by.xdoomi.paint_number;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener {
    private DrawingView drawView;
    private ImageButton newBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawView = (DrawingView) findViewById(R.id.drawing);

        newBtn = (ImageButton) findViewById(R.id.new_btn);
        newBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if(view.getId()==R.id.new_btn){
            drawView.startNew();
        }
    }

}