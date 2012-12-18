package com.gclue.DrawSample004;

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
		// クラスのインスタンスを生成
		MyView mView = new MyView( this );

		// Viewに設定
		setContentView( mView );
	}
}

/**
 * 描画用のクラス。
 */
class MyView extends View {

	/**
	 * コンストラクタ。
	 * @param context コンテキスト
	 */
	public MyView( Context context ) {
		super( context );
		setFocusable( true );
	}

	/**
	 * 描画処理を行う。
	 */
	@Override
	protected void onDraw( Canvas canvas ) {
		super.onDraw( canvas );

		// 背景色を設定
		canvas.drawColor( Color.BLUE );

		// 描画するための線の色を設定
		Paint mPaint = new Paint();
		mPaint.setStyle( Paint.Style.FILL );
		mPaint.setARGB( 255, 255, 255, 100 );
//		mPaint.setAntiAlias( true );

		// 円を描画
		canvas.drawCircle( 50, 50, 20, mPaint );
	}
}