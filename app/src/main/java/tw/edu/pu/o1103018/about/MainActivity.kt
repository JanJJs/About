package tw.edu.pu.o1103018.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv.setOnClickListener({
            if(txv.text == "你好tcyang"){
                txv.text = "海青班不錯"
            }
            else{
                txv.text = "你好tcyang"
            }
        })
    }
}