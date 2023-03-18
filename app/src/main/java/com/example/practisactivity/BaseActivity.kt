package com.example.practisactivity

import android.app.ProgressDialog
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

 open  class BaseActivity:AppCompatActivity() {

     companion object fun Alert() {

         val alertDialog = AlertDialog.Builder(this)
         alertDialog.setTitle(resources.getString(R.string.app_name))
         alertDialog.setMessage("Do you want to exit?")
         alertDialog.setPositiveButton("EXIT", object : DialogInterface.OnClickListener {
             override fun onClick(p0: DialogInterface?, p1: Int) {

                 finish()

             }

         })
         //   set negative button .
         alertDialog.setNegativeButton("No", object : DialogInterface.OnClickListener {
             override fun onClick(p0: DialogInterface?, p1: Int) {

             }

         })

         var alert = alertDialog.create()
         alertDialog.show()

     }


     open  fun progress() {

         val progressDialog = ProgressDialog(this)
         progressDialog.setTitle("Go to BMI Application")
         progressDialog.setMessage("Application is loading, please wait")
         progressDialog.setCancelable(false)

         progressDialog.setButton("cancle",object :DialogInterface.OnClickListener{
             override fun onClick(p0: DialogInterface?, p1: Int) {

                 finish()
             }

         })


         progressDialog.show()



     }
     open fun custom(){





     }
}

