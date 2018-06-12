# Signature Capture

Simple code to take the Signature of the customer/client according to need

**_How to add gradle in your code_**

In top Level build file add the below code


    repositories {
    
        //other stuff here
        
        maven { url 'https://jitpack.io' }
        }
      }


Then in project level build file add the below line

    implementation 'com.github.nawanirakshit:Signature-Capture:1.1'


   This will add the required functionality to you project

 **Usage**


    <com.rakshit.signaturecapture.CaptureSignature
        android:id="@+id/signature_canvas"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:pen_color="#ea0b46" //optional
        app:pen_size="7dp" //optional
        android:background="#edeeef" />

_You can change background color according to your need_

More changes to be added soon.
You can add your suggestions if needed will add them accordingly.


