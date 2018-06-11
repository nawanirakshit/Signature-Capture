# Signature Capture

Simple code to take the Signature of the customer/client according to need

In top Level build file add the below code

allprojects {
    repositories {

        maven { url 'https://jitpack.io' }


Then in project level build file add the below line

    implementation 'com.github.nawanirakshit:Signature-Capture:1.1'

    This will add the required functionality to you project

    <b>Usage</b>


    <com.rakshit.signaturecapture.CaptureSignature
        android:id="@+id/signature_canvas"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#edeeef" />

//You can change background color according to your need

Extra tags you can user are listed below

app:pen_color="#ea0b46" // Changing the pen color
app:pen_size="7dp" // changing the size of the pen


Moe changes to be added soon.



