package my.kim.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_main.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        goBackBtn.setOnClickListener {
           //돌아갈때는 intent로 돌아가지 않음 왜냐면 인텐트는 새로운 화면을 만드는 효과가 있기에
//            val myIntent = Intent(this, MainActivity::class.java)
           finish()

        }
    }
}
