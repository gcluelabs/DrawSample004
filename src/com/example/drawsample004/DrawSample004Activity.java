package com.example.drawsample004;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class DrawSample004Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		MyView mView = new MyView( this );
		setContentView( mView );
	}
}

class MyView extends View {

	public MyView( Context context ) {
		super( context );
		setFocusable( true );
	}

	@Override
	protected void onDraw( Canvas canvas ) {
		super.onDraw( canvas );

		canvas.drawColor( Color.BLUE );

		Paint mPaint = new Paint();
		mPaint.setStyle( Paint.Style.FILL );
		mPaint.setARGB( 255, 255, 255, 100 );
//		mPaint.setAntiAlias( true );

		canvas.drawCircle( 50, 50, 20, mPaint );
	}
}