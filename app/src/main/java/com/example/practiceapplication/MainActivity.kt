package com.example.practiceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flag : String = "apple juice"
        var price: Int = 0;
        val number: EditText = findViewById(R.id.editTextNumber)
        val calcbtn: Button = findViewById(R.id.button)
        val total: TextView = findViewById(R.id.textView3)

        val List: Spinner= findViewById(R.id.spinner)
        var options = arrayOf("apple juice","hashbrowns","banana","kiwi")
        List.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)
        List.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        calcbtn.setOnClickListener {view->
            if (flag == "apple juice")
                price = 99
            else if(flag == "hashbrowns")
                price = 12
            else if(flag == "banana")
                price = 3
            else
                price = 5
            var x:Int = number.text.toString().toInt()
            var result: Int = x*price
            var text:String = "total is: "+result+"JD"
            total.text= text.toString()
        }


    }
}