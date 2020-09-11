package com.example.aplikasimenurumahmakan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View

import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun hitungTotal(view: View) {
        var totalMakanan = 0
        var totalMinuman = 0
//        val makananObjek: Map<CheckBox, TextView> =
//            mapOf(
//                cb_makanan1 to et_makanan1,
//                cb_makanan2 to et_makanan2,
//                cb_makanan3 to et_makanan3,
//                cb_makanan4 to et_makanan4
//            )
//        val minumanObjek: Map<CheckBox, TextView> =
//            mapOf(
//                cb_minuman1 to et_minuman1,
//                cb_minuman2 to et_minuman2,
//                cb_minuman3 to et_minuman3,
//                cb_minuman4 to et_minuman4
//            )
//        for((cb_makanan, et_makanan) in makananObjek){
//            if(cb_makanan.isChecked){
//                totalMakanan += (et_makanan.text.toString().toInt()*15000)
//            }
//        }
//
//        for((cb_minuman, et_minuman) in makananObjek){
//            if(cb_minuman.isChecked){
//                totalMakanan += (et_minuman.text.toString().toInt()*15000)
//            }
//        }
        if (cb_makanan1.isChecked && et_makanan1.text.toString() != "") {
            totalMakanan += (et_makanan1.text.toString().toInt() * 15000)
        }
        if (cb_makanan2.isChecked && et_makanan2.text.toString() != "") {
            totalMakanan += (et_makanan2.text.toString().toInt() * 12000)
        }
        if (cb_makanan3.isChecked && et_makanan3.text.toString() != "") {
            totalMakanan += (et_makanan3.text.toString().toInt() * 16000)
        }
        if (cb_makanan4.isChecked && et_makanan4.text.toString() != "") {
            totalMakanan += (et_makanan4.text.toString().toInt() * 15000)
        }
        if (cb_minuman1.isChecked && et_minuman1.text.toString() != "") {
            totalMinuman += (et_minuman1.text.toString().toInt() * 5000)
        }
        if (cb_minuman2.isChecked && et_minuman2.text.toString() != "") {
            totalMinuman += (et_minuman2.text.toString().toInt() * 1000)
        }
        if (cb_minuman3.isChecked && et_minuman3.text.toString() != "") {
            totalMinuman += (et_minuman3.text.toString().toInt() * 3000)
        }
        if (cb_minuman4.isChecked && et_minuman4.text.toString() != "") {
            totalMinuman += (et_minuman4.text.toString().toInt() * 6000)
        }
        tv_total_makanan.text = totalMakanan.toString()
        tv_total_minuman.text = totalMinuman.toString()
        tv_grand_total.text = (totalMakanan + totalMinuman).toString()
    }

    //Function untuk hitung kembalian
    fun hitungKembali(view: View) {
        var grandTotal = tv_grand_total.text.toString().toInt()
        var uangBayar = et_bayar.text.toString()
        var uangBayar2 = 0
        if (uangBayar != "") {
            uangBayar2 = uangBayar.toInt()
        }
        if (uangBayar2 < grandTotal) {
            val myToast = Toast.makeText(this, "Maaf Uang bayarnya Kurang", Toast.LENGTH_LONG)
            myToast.setGravity(Gravity.TOP, 0, 0)
            myToast.show()
        } else if (uangBayar2 == grandTotal) {
            val myToast =
                Toast.makeText(this, "Terima kasih atas kedatangan Anda", Toast.LENGTH_LONG)
            myToast.setGravity(Gravity.TOP, 0, 0)
            myToast.show()
        } else {
            var kembali = uangBayar2 - grandTotal
            val myToast = Toast.makeText(
                this, "Terimakasih atas kedatangan anda \n" +
                        "Uang Kembali sebesar Rp. " + kembali, Toast.LENGTH_LONG
            )
            myToast.setGravity(Gravity.CENTER, 0, 0)
            myToast.show()
        }
    }
}
