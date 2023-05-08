package otus.prokofev.homework.fragments.one

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import otus.prokofev.homework.fragments.R

class FirstTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_task)

        supportFragmentManager.commit {
            replace<MainFragment>(R.id.container)
        }
    }

}


