package com.example.flagment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), ButtonFragment.OnButtonClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportFragmentManager.findFragmentByTag("labelFragment") == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, newLabelFragment(0), "labelFragment")
                .commit()
        }
    }

    override fun onButtonClicked() {
        val fragment = supportFragmentManager.findFragmentByTag("labelFragment") as LabelFragment
        fragment.update()
    }
}
