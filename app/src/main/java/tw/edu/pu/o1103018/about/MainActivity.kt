package tw.edu.pu.o1103018.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv.setOnClickListener({
            if(txv.text == "你好tcyang"){
                txv.text = "海青班很棒，數媒更是好的方向"
            }
            else{
                txv.text = "你好tcyang"
            }
        })
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var txv:TextView = findViewById(R.id.txv)
        txv.text = "熒幕觸控"
        return true
    }

}