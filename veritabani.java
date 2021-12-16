package com.example.sonveritaban;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class veritabani extends SQLiteOpenHelper {

    private static final String VERİTABAİ_ADİ="ogrenciler";
    private static final int SURUM=1;

    public veritabani(Context c)
    {
        super(c,VERİTABAİ_ADİ,null,SURUM);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE ogrencibilgi (ad Text, soyad Text,yas Integer,sehir Text);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int eskiversiyon, int yeniversiyon) {
        db.execSQL("DROP TABLE IF EXISTS ogrencibilgi");
        onCreate(db);
    }
}
