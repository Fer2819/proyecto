<?xml version="1.0" encoding="utf-8"?>


<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"

    xmlns:tools="http://schemas.android.com/tools"

    android:layout_width="match_parent"

    android:layout_height="match_parent"

    tools:context=".mainActivity"

    android:background="#21af8a">

<ImageView

android:id="@+id/imageView1"

android:layout_width="200dp"

android:layout_height="200dp"

android:layout_alignParentTop="true"

android:layout_centerHorizontal="true"

android:layout_marginTop="61dp"

android:src="@drawable/logo"/>

<TextView

android:id="@+id/textViewIntro"

android:layout_width="wrap_content"

android:layout_height="wrap_content"

android:layout_below="@+id/imageView1"

android:layout_centerHorizontal="true"

android:layout_marginTop="52dp"

android:text="@string/Intro"

android:textSize="25dp"/>


    <menu xmlns:android="http://schemas.android.com/apk/res/android">

        <item
            android:id="@+id/menu_settings"
            android:orderInCategory="100"
            android:showAsAction="never"
            android:title="@string/menu_settings" android:icon="@android:drawable/ic_dialog_info"/>
    </menu>

</RelativeLayout>

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     