gradientbackground.xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
<gradient android:angle="45"
    android:startColor="@color/startblue"
    android:endColor="@color/endblue"
    />

</shape>

buttonstyle.xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <solid android:color="#4bb6ef" />
    <padding android:top="15dp"
     android:left="15dp"
     android:right="15dp"
     android:bottom="15dp" />
    <corners android:radius="45dp" />
</shape>

activity_profile.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.demotxt.droidsrce.profileui.MainActivity"
    android:background="@color/graylight"
    android:orientation="vertical">
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="405dp">
        <LinearLayout
            android:background="@drawable/gradientbackground"
            android:layout_width="match_parent"
            android:layout_height="350dp"
            android:orientation="vertical">
            <ImageView
                android:layout_marginTop="45dp"
                android:layout_gravity="center_horizontal"
                android:layout_width="150dp"
                android:layout_height="150dp"
                android:src="@drawable/photocercle"/>
            <TextView
                android:layout_marginTop="10dp"
                android:layout_gravity="center_horizontal"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Wiliam Snoe"
                android:textColor="#fff"
                android:textStyle="bold"
                android:textSize="21sp"/>
        </LinearLayout>
        <android.support.v7.widget.CardView
            android:layout_width="400dp"
            android:layout_height="120dp"
            android:layout_centerHorizontal="true"
            android:layout_marginTop="275dp">
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="horizontal"
                android:weightSum="3">
                <LinearLayout
                    android:gravity="center"
                    android:orientation="vertical"
                    android:layout_width="0dp"
                    android:layout_weight="1"
                    android:layout_height="match_parent">
                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Photos"
                        android:textSize="20sp"
                        />
                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="125"
                        android:textStyle="bold"
                        android:textSize="20sp"
                        android:paddingTop="10dp"
                        android:textColor="@color/startblue"/>

                </LinearLayout>
                <LinearLayout
                    android:gravity="center"
                    android:orientation="vertical"
                    android:layout_width="0dp"
                    android:layout_weight="1"
                    android:layout_height="match_parent">
                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Followers"
                        android:textSize="20sp"
                        />
                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="1205"
                        android:textStyle="bold"
                        android:textSize="20sp"
                        android:paddingTop="10dp"
                        android:textColor="@color/startblue"/>

                </LinearLayout>
                <LinearLayout
                    android:gravity="center"
                    android:orientation="vertical"
                    android:layout_width="0dp"
                    android:layout_weight="1"
                    android:layout_height="match_parent">
                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Following"
                        android:textSize="20sp"
                        />
                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="360"
                        android:textStyle="bold"
                        android:textSize="20sp"
                        android:paddingTop="10dp"
                        android:textColor="@color/startblue"/>

                </LinearLayout>
            </LinearLayout>

        </android.support.v7.widget.CardView>
    </RelativeLayout>

    <LinearLayout
        android:layout_width="360dp"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:layout_gravity="center"
        android:layout_marginTop="45dp">
        <LinearLayout
            android:orientation="horizontal"
            android:paddingLeft="25dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <ImageView
                android:layout_width="36dp"
                android:layout_height="36dp"
                android:src="@drawable/ic_email_black_24dp"/>
            <TextView
                android:textStyle="bold"
                android:layout_gravity="center_vertical"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:paddingLeft="20dp"
                android:text="Wiliam@gmail.com"/>
        </LinearLayout>
        <LinearLayout
            android:layout_marginTop="25dp"
            android:orientation="horizontal"
            android:paddingLeft="25dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <ImageView
                android:layout_width="36dp"
                android:layout_height="36dp"
                android:src="@drawable/ic_phone_android_black_24dp"/>
            <TextView
                android:textStyle="bold"

                android:layout_gravity="center_vertical"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:paddingLeft="20dp"
                android:text="+266 225 225"/>
        </LinearLayout>
        <LinearLayout
            android:layout_marginTop="25dp"
            android:orientation="horizontal"
            android:paddingLeft="25dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <ImageView
                android:layout_width="36dp"
                android:layout_height="36dp"
                android:src="@drawable/ic_group_add_black_24dp"/>
            <TextView
                android:textStyle="bold"

                android:layout_gravity="center_vertical"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:paddingLeft="20dp"
                android:text="Add to group"/>
        </LinearLayout>
        <LinearLayout
            android:layout_marginTop="25dp"
            android:orientation="horizontal"
            android:paddingLeft="25dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <ImageView
                android:layout_width="36dp"
                android:layout_height="36dp"
                android:src="@drawable/ic_forum_black_24dp"/>
            <TextView
                android:textStyle="bold"

                android:layout_gravity="center_vertical"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:paddingLeft="20dp"
                android:text="Show all comments"/>
        </LinearLayout>
    </LinearLayout>

    <Button
        android:textColor="#fff"
        android:background="@drawable/buttonstyleithgradient"
        android:layout_marginTop="35dp"
        android:layout_gravity="center_horizontal"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Follow Me"/>

</LinearLayout>
