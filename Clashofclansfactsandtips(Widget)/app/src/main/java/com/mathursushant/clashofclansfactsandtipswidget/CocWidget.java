package com.mathursushant.clashofclansfactsandtipswidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RadialGradient;
import android.widget.RemoteViews;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Implementation of App Widget functionality.
 */
public class CocWidget extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        final int N = appWidgetIds.length;
        for (int i = 0; i < N; i++) {
            updateAppWidget(context, appWidgetManager, appWidgetIds[i]);
            Resources res = context.getResources();
            String[] Mylist;
            Mylist = res.getStringArray(R.array.fact_list);
            double key = random();
            int conv = (int)key;
            String toBeDisplayed = Mylist[conv];

        }
    }


    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }
    public double random(){
        double randomno;
        randomno = Math.random();
        return randomno;
    }
    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {
        
        CharSequence widgetText = "All the hidden teslas reveal themselves automatically after 50% damage";
        // Construct the RemoteViews object
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.coc_widget);
        views.setTextViewText(R.id.appwidget_text, widgetText);

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }
}


