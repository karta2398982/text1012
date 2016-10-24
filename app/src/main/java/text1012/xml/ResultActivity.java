package text1012.xml;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.text1012.R;


public class ResultActivity extends AppCompatActivity {

    private Button button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

            VideoView videoView = (VideoView) this.findViewById(R.id.videoView);
            MediaController mc = new MediaController(this);
            videoView.setMediaController(mc);
            videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
            videoView.requestFocus();
            videoView.start();


        button = (Button)this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
           @Override
            public void  onClick(View v){
               ResultActivity.this.finish();
           }

        });

    }
}
