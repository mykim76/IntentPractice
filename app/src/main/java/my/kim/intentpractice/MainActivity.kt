package my.kim.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFirstBtn.setOnClickListener {
            //비행기 티켓 발권 (출발지와 / 도착지를 명시한다)
            val myIntent = Intent(this, FirstActivity::class.java)
            // 실제 비행기 탑승 (출발)
            // 특이사항 : 실제로는 액티비티 이동이 아니라 기존에 얹어
            startActivity(myIntent)
        }



    }
}
