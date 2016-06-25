package game.imran.com.gamepractice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Imran on 6/25/2016.
 */
public class PlayerShip {
    private Bitmap mBitmap;
    private int x, y;
    private int speed = 0;

    //Game objects
    private PlayerShip player;

    public PlayerShip(Context context) {
       player = new PlayerShip(context);
        x = 50;
        y = 50;
        speed = 1;
        mBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ship);
    }

    public void update() {
        x++;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        mBitmap = bitmap;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
