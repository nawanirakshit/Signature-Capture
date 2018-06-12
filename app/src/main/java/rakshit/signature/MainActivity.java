package rakshit.signature;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.rakshit.signaturecapture.CaptureSignature;

public class MainActivity extends AppCompatActivity {

    private CaptureSignature signature;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = MainActivity.this;

        signature = findViewById(R.id.signature_canvas);
    }


    /**
     * Clearing the view
     *
     * @param view View
     */
    public void onClearView(View view) {
        signature.clearCanvas();
    }

    /**
     * Check func to check if the view is updated or not
     * Setting the bitmap in the ImageView
     *
     * @param view View
     */
    public void onCheckView(View view) {

        Bitmap bmp = signature.getViewBitmap(signature);
        ImageView mImage = findViewById(R.id.iv_bitmap);

        if (signature.isUpdated()) {
            Toast.makeText(mContext, "View Updated", Toast.LENGTH_SHORT).show();
            mImage.setImageBitmap(bmp);
        } else {
            Toast.makeText(mContext, "View not Updated", Toast.LENGTH_SHORT).show();
            mImage.setImageBitmap(null);
        }


    }


}
