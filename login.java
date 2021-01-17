# Login

import android.content.Intent;
import android.util.Patterns;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    Button login;
    TextView register;
    boolean isEmailValid, isPasswordValid;
    TextInputLayout emailError, passError;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        register = (TextView) findViewById(R.id.register);
        emailError = (TextInputLayout) findViewById(R.id.emailError);
        passError = (TextInputLayout) findViewById(R.id.passError);
        		
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetValidation();
            }
        });
		
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to RegisterActivity
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
	
    public void SetValidation() {
    	// Check for a valid email address.
        if (email.getText().toString().isEmpty()) {
            emailError.setError(getResources().getString(R.string.email_error));
            isEmailValid = false;
     	} else if (!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
            emailError.setError(getResources().getString(R.string.error_invalid_email));
            isEmailValid = false;
        } else  {
            isEmailValid = true;
            emailError.setErrorEnabled(false);
        }
	
        // Check for a valid password.
        if (password.getText().toString().isEmpty()) {
            passError.setError(getResources().getString(R.string.password_error));
            isPasswordValid = false;
     	} else if (password.getText().length() < 6) {
            passError.setError(getResources().getString(R.string.error_invalid_password));
            isPasswordValid = false;
        } else  {
            isPasswordValid = true;
            passError.setErrorEnabled(false);
        }
		
        if (isEmailValid && isPasswordValid) {
            Toast.makeText(getApplicationContext(), "Successfully", Toast.LENGTH_SHORT).show();
        }
	 
    }

}
FRONT END
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/gradient"
    android:gravity="center"
    android:padding="16dp"
    tools:context=".LoginActivity">
        
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center">
    
        <android.support.v7.widget.CardView
            xmlns:Card_View="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_height="350dp"
            android:layout_margin="5dp"
            android:padding="10dp"
            Card_View:cardCornerRadius="5dp"
            Card_View:cardElevation="5dp">
    
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_margin="5dp"
                android:orientation="vertical">
        
                <android.support.design.widget.TextInputLayout
                    android:id="@+id/emailError"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="5dp">
                
                    <EditText
                        android:id="@+id/email"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="10dp"
                        android:hint="@string/prompt_email"
                        android:inputType="textEmailAddress"
                        android:maxLines="1"
                        android:paddingStart="5dp"
                        android:singleLine="true"/>
                
                </android.support.design.widget.TextInputLayout>
		        
                <android.support.design.widget.TextInputLayout
                    android:id="@+id/passError"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="5dp"
                    app:passwordToggleEnabled="true">
                
                    <EditText
                        android:id="@+id/password"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="10dp"
                        android:hint="@string/prompt_password"
                        android:inputType="textPassword"
                        android:maxLines="1"
                        android:paddingStart="5dp"
                        android:singleLine="true"/>
                
                </android.support.design.widget.TextInputLayout>
		        
                <Button
                    android:id="@+id/login"
                    android:layout_width="match_parent"
                    android:layout_height="50dp"
                    android:layout_margin="20dp"
                    android:background="@drawable/button_gradient"
                    android:text="@string/login"
                    android:textColor="@android:color/white"
                    android:textSize="16sp"/>
                
                <TextView
                    android:id="@+id/register"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="5dp"
                    android:gravity="center"
                    android:text="@string/create_new"
                    android:textColor="@color/colorPrimary"
                    android:textSize="16sp"/>
        
            </LinearLayout>
        </android.support.v7.widget.CardView>
    </RelativeLayout>
    
    <ImageView
        android:id="@+id/profile"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="-50dp"
        android:background="@drawable/round_background"
        android:padding="15dp"
        android:src="@drawable/profile"/>
        
</RelativeLayout>
