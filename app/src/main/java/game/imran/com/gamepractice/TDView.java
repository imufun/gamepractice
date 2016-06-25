package game.imran.com.gamepractice;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class TDView extends SurfaceView implements Runnable {

    volatile boolean playing;
    Thread gameThread = null;

    public TDView(Context context) {
        super(context);
    }

    public TDView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TDView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TDView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void run() {

        while (playing) {
            update();
            draw();
            control();
        }

    }

    public void pause(){
        playing =false;
        try {
            gameThread.join();
        }catch (InterruptedException e){

        }

    }

    public void resume(){
        playing = true;
        gameThread = new Thread(this);
        gameThread.start();
    }

    private void control() {
    }

    private void update() {
    }

    private void draw() {
    }
}
