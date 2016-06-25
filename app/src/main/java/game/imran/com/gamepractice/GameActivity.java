package game.imran.com.gamepractice;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceHolder;

public class GameActivity extends AppCompatActivity {
    private TDView gameView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_game);
        //this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
         getSupportActionBar().hide();

        gameView = new TDView(this);
        setContentView(gameView);


    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();

    }

    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
