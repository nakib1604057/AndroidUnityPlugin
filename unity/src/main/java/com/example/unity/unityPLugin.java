package com.example.unity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import androidx.core.view.KeyEventDispatcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class unityPLugin {
     private  static  final unityPLugin ourInstance = new unityPLugin();
     private  static  final String LOGTAG = "CWFTEch";
     public  static unityPLugin getInstance(){ return ourInstance; }
     public  static Activity mainActivity;
//     public  interface AlertViewCallback{
//       public  void onButtonTapped(int id);
//     };
     private  long startTime;
     private unityPLugin(){
//      Log.i(LOGTAG,"created Plugin");

      startTime=System.currentTimeMillis();

//         sendBroadcast();

     }
//     public  void showAlertView(String[] strings, final AlertViewCallback callback){
//
//         if(strings.length<3){
//             Log.i(LOGTAG,"error-exprectd at least"+strings.length);
//             return;
//         }
//         DialogInterface.OnClickListener myClickListener =  new DialogInterface.OnClickListener() {
//             @Override
//             public void onClick(DialogInterface dialogInterface, int id) {
//               dialogInterface.dismiss();
//               Log.i(LOGTAG,"Tapped" + id);
//               Intent i = new Intent();
////               i.setAction("com.DefaultCompany.firstApp");
////               i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
////               i.putExtra(Intent.EXTRA_TEXT, "Hello from android");
////               i.setType("text/plain");
////               mainActivity.sendBroadcast(i);
//                 ComponentName cn = new ComponentName("com.example.readandwritefile","com.example.readandwritefile.MyReceiver");
//                 i.setComponent(cn);
//                 i.putExtra(Intent.EXTRA_TEXT, strings[1].toString());
//                 i.setType("text/plain");
//                 mainActivity.sendBroadcast(i);
//
//
//               Log.i("boradcast","send");
//               callback.onButtonTapped(id);
//             }
//         };
//
//         AlertDialog alertDialog =  new AlertDialog.Builder(mainActivity)
//                 .setTitle(strings[0])
//                 .setMessage(strings[1])
//                 .setCancelable(false)
//                 .create();
//         alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL , strings[2] , myClickListener);
//
//         if (strings.length > 3)
//             alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL , strings[3] , myClickListener);
//         if (strings.length > 4)
//             alertDialog.setButton(AlertDialog.BUTTON_POSITIVE , strings[4]  , myClickListener);
//         alertDialog.show();
//     }

//     public double getElapsedTime(){
//         return (System.currentTimeMillis()-startTime)/1000.0f;
//     }
     public void sendDataTOPocket(String[] strings){
         Log.i(LOGTAG,"Tapped");
         Intent i = new Intent();
//               i.setAction("com.DefaultCompany.firstApp");
//               i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//               i.putExtra(Intent.EXTRA_TEXT, "Hello from android");
//               i.setType("text/plain");
//               mainActivity.sendBroadcast(i);
         ComponentName cn = new ComponentName("com.example.readandwritefile","com.example.readandwritefile.MyReceiver");
         i.setComponent(cn);
         i.putExtra(Intent.EXTRA_TEXT, strings[0].toString());
         i.setType("text/plain");
         mainActivity.sendBroadcast(i);
     }

}
