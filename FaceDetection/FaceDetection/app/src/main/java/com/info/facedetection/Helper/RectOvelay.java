package com.info.facedetection.Helper;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class RectOvelay extends GraphicOverlay.Graphic{
    private int mReatColor = Color.GREEN;
    private float mStrokedWidth = 4.0f;
    private Paint mReotPaint;
    private GraphicOverlay graphicOverlay;
    private Rect rect;


    public RectOvelay(GraphicOverlay graphicOverlay, Rect rect) {
        super(graphicOverlay);
        mReotPaint = new Paint();
        mReotPaint.setColor(mReatColor);
        mReotPaint.setStyle(Paint.Style.STROKE);
        mReotPaint.setStrokeWidth(mStrokedWidth);

        this.graphicOverlay = graphicOverlay;
        this.rect=rect;

        postInvalidate();

    }

    @Override
    public void draw(Canvas canvas) {
        RectF rectF=new RectF(rect);
        rectF.left=translateX(rectF.left);
        rectF.right=translateX(rectF.right);
        rectF.top=translateX(rectF.top);
        rectF.bottom=translateX(rectF.bottom);

        canvas.drawRect(rectF, mReotPaint);

    }
}
