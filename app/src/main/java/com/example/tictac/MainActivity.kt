package com.example.tictac

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player1: TextView =findViewById(R.id.textView)
        val player2: TextView =findViewById(R.id.textView2)

        val b1: Button =findViewById(R.id.B1)
        val b2: Button =findViewById(R.id.B2)
        val b3: Button =findViewById(R.id.B3)
        val b4: Button =findViewById(R.id.B4)
        val b5: Button =findViewById(R.id.B5)
        val b6: Button =findViewById(R.id.B6)
        val b7: Button =findViewById(R.id.B7)
        val b8: Button =findViewById(R.id.B8)
        val b9: Button =findViewById(R.id.B9)
        val b10: Button =findViewById(R.id.b10)
        var z=0
        val text1: EditText =findViewById(R.id.editTextTextPersonName)
        val text2: EditText =findViewById(R.id.editTextTextPersonName2)
        fun toggle(Playeron:TextView,Playeroff:TextView){
            Playeroff.setTextColor(ContextCompat.getColor(this, androidx.appcompat.R.color.material_blue_grey_800))
            Playeroff.setTypeface(null, Typeface.NORMAL)
            Playeron.setTextColor(ContextCompat.getColor(this,R.color.purple_200))
            Playeron.setTypeface(null, Typeface.BOLD)



        }
        b10.setOnClickListener {
            b1.text="N"
            b2.text="N"
            b3.text="N"
            b4.text="N"
            b5.text="N"
            b6.text="N"
            b7.text="N"
            b8.text="N"
            b9.text="N"
            z=0
            b1.isEnabled=true
            b2.isEnabled=true
            b3.isEnabled=true
            b4.isEnabled=true
            b5.isEnabled=true
            b6.isEnabled=true
            b7.isEnabled=true
            b8.isEnabled=true
            b9.isEnabled=true
            toggle(player1, player2)
        }
        fun check2(){
            if(b1.text=="O"&& b2.text=="O"&& b3.text=="O")
                Toast.makeText(this,"${text1.text} won", Toast.LENGTH_LONG).show()
            else if(b4.text=="O"&& b5.text=="O"&& b6.text=="O")
                Toast.makeText(this,"${text1.text} won", Toast.LENGTH_LONG).show()
            else if(b7.text=="O"&& b8.text=="O"&& b9.text=="O")
                Toast.makeText(this,"${text1.text} won", Toast.LENGTH_LONG).show()

            else if(b1.text=="X"&& b2.text=="X"&& b3.text=="X")
                Toast.makeText(this,"${text2.text} won", Toast.LENGTH_LONG).show()

            else if(b4.text=="X"&& b5.text=="X"&& b6.text=="X")
                Toast.makeText(this,"${text2.text} won", Toast.LENGTH_LONG).show()
            else if(b7.text=="X"&& b8.text=="X"&& b9.text=="X")
                Toast.makeText(this,"${text2.text} won", Toast.LENGTH_LONG).show()
            else if(b1.text=="O"&& b4.text=="O"&& b7.text=="O")
                Toast.makeText(this,"${text1.text} won", Toast.LENGTH_LONG).show()
            else if(b2.text=="O"&& b5.text=="O"&& b8.text=="O")
                Toast.makeText(this,"${text1.text} won", Toast.LENGTH_LONG).show()
            else if(b3.text=="O"&& b6.text=="O"&& b9.text=="O")
                Toast.makeText(this,"${text1.text} won", Toast.LENGTH_LONG).show()

            else if(b1.text=="X"&& b4.text=="X"&& b7.text=="X")
                Toast.makeText(this,"${text2.text} won", Toast.LENGTH_LONG).show()
            else if(b2.text=="X"&& b5.text=="X"&& b8.text=="X")
                Toast.makeText(this,"${text2.text} won", Toast.LENGTH_LONG).show()
            else if(b3.text=="X"&& b6.text=="X"&& b9.text=="X")
                Toast.makeText(this,"${text2.text} won", Toast.LENGTH_LONG).show()
            else if(b1.text=="O"&& b5.text=="O"&& b9.text=="O")
                Toast.makeText(this,"${text1.text} won", Toast.LENGTH_LONG).show()
            else if(b3.text=="O"&& b5.text=="O"&& b7.text=="O")
                Toast.makeText(this,"${text1.text} won", Toast.LENGTH_LONG).show()
            else if(b1.text=="X"&& b5.text=="X"&& b9.text=="X")
                Toast.makeText(this,"${text2.text} won", Toast.LENGTH_LONG).show()
            else if(b3.text=="X"&& b5.text=="X"&& b7.text=="X")
                Toast.makeText(this,"${text2.text} won", Toast.LENGTH_LONG).show()
            else if(b1.text!="N"&&b2.text!="N"&&b3.text!="N"&&b4.text!="N"&&b5.text!="N"&&b6.text!="N"&&b7.text!="N"&&b8.text!="N"&&b9.text!="N")
                Toast.makeText(this,"Draw!!!!", Toast.LENGTH_LONG).show()

        }
        player1.setTextColor(ContextCompat.getColor(this,R.color.purple_200))
        player1.setTypeface(null, Typeface.BOLD)


        b1.setOnClickListener {

            if(b1.text=="N"){
                if(z%2==0) {
                    b1.text = "O"
                    toggle(player2,player1)

                }
                else {
                    b1.text = "X"
                    toggle(player1, player2)
                }
                z++
                b1.isEnabled=false




            }

            check2()
        }
        b2.setOnClickListener {

            if(b2.text=="N"){
                if(z%2==0){
                    b2.text="O"
                    toggle(player2,player1)
                }
                else {
                    b2.text = "X"
                    toggle(player1, player2)
                }
                z++
                b2.isEnabled=false

            }

            check2()
        }
        b3.setOnClickListener {

            if(b3.text=="N"){
                if(z%2==0) {
                    b3.text = "O"
                    toggle(player2,player1)

                }
                else{
                    b3.text="X"
                    toggle(player1,player2)
                }

                z++
                b3.isEnabled=false

            }
            check2()
        }
        b4.setOnClickListener {

            if(b4.text=="N"){
                if(z%2==0) {
                    b4.text = "O"
                    toggle(player2, player1)
                }
                else {
                    b4.text = "X"
                    toggle(player1, player2)
                }
                z++
                b4.isEnabled=false
            }
            check2()
        }
        b5.setOnClickListener {

            if(b5.text=="N"){
                if(z%2==0) {
                    b5.text = "O"
                    toggle(player2, player1)
                }
                else {
                    b5.text = "X"
                    toggle(player1, player2)
                }
                z++
                b5.isEnabled=false
            }
            check2()
        }
        b6.setOnClickListener {

            if(b6.text=="N"){
                if(z%2==0){
                    b6.text="O"
                    toggle(player2,player1)
                }
                else{
                    b6.text="X"
                    toggle(player1,player2)
                }
                z++
                b6.isEnabled=false
            }
            check2()
        }
        b7.setOnClickListener {

            if(b7.text=="N"){
                if(z%2==0) {
                    b7.text = "O"
                    toggle(player2, player1)
                }
                else {
                    b7.text = "X"
                    toggle(player1, player2)
                }
                z++
                b7.isEnabled=false
            }
            check2()
        }
        b8.setOnClickListener {

            if(b8.text=="N"){
                if(z%2==0) {
                    b8.text = "O"
                    toggle(player2, player1)
                }
                else {
                    b8.text = "X"
                    toggle(player1, player2)
                }
                z++
                b8.isEnabled=false
            }
            check2()
        }
        b9.setOnClickListener {

            if(b9.text=="N"){
                if(z%2==0) {
                    b9.text = "O"
                    toggle(player2, player1)
                }
                else {
                    b9.text = "X"
                    toggle(player1, player2)
                }
                z++
                b9.isEnabled=false
            }
            check2()
        }







    }

}