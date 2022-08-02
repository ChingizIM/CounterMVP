package com.example.countermvp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.countermvp.databinding.ActivityMainBinding
import com.example.countermvp.presenter.Presenter
import com.example.countermvp.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    //var count = 0
    var presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter=Injector.getPresenter()
        presenter.attachView(this)
        initCliker()
    }

    private fun initCliker() {
        with(binding){
            //with - расширение зоны видимости
            incrementBtn.setOnClickListener{
                presenter.increment()
            }
            decrementBtn.setOnClickListener{
                presenter.decrement()
            }
        }
       // binding.incrementBtn.setOnClickListener {
         //   count++
           // binding.counterTv.text = count.toString() }
        //binding.decrementBtn.setOnClickListener {
          //  count--
            //binding.counterTv.text = count.toString() }
    }

    override fun updateCount(count: String) {
        binding.counterTv.text=count
    }


    override fun showToastPlus() {
        showToast("Поздравляю")


    }

    override fun showToastColor() {

        binding.counterTv.setBackgroundColor(Color.GREEN)
    }

}