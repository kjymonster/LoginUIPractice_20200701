package kr.co.jykim3.loginuipractice_20200701

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exitBtn.setOnClickListener {

            Toast.makeText(this, "종료합니다.", Toast.LENGTH_SHORT).show()
        }

        logInBtn.setOnClickListener {

            val inputId = idEdit.text.toString()
            val inputPw = pwEdit.text.toString()
            val inputDesti = destinationEdt.text.toString()


            if (inputId == "admin@lottejtb.com" && inputPw.equals("lottejtb4$")){
                Toast.makeText(this, "관리자계정으로 로그인 합니다", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "일반계정으로 로그인 합니다.", Toast.LENGTH_SHORT).show()
            }

            when(inputDesti) {
                "일본" -> {"일본 여행 정보를 우선 노출 합니다."}
                "중국" -> {"중국 여행 정보를 우선 노출 합니다."}
                "국내" -> {"국내 여행 정보를 우선 노출 합니다."}
                "미주", "유렵" -> {"코로나19로 인해 여행이 제한된 지역입니다."}
                else -> {"잘못 입력하셨습니다."}
            }

        }

    }
}