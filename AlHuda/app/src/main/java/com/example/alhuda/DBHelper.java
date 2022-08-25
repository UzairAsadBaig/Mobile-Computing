package com.example.alhuda;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.quranapp.ui.gallery.GalleryFragment;

import java.util.ArrayList;

public class DbHelper extends SQLiteOpenHelper{



    public DbHelper(@Nullable Context context) {
        super(context, "quran_database_new.db", null, 1);
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
