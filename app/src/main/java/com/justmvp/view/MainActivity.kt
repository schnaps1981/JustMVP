package com.justmvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.justmvp.R
import com.justmvp.presenter.Presenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ViewContract {

    val presenter : Presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()

        btn_dowork.setOnClickListener {
            presenter.doWork()
        }
    }

    private fun initPresenter() {
        presenter.attachView(this)
    }

    override fun showMessage(message: String) {
        tv_workdone.text = message
    }

    override fun onDestroy() {
        presenter.detachView()
        super.onDestroy()
    }
}
