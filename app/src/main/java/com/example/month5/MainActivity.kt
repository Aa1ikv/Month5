package com.example.month5

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.month5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterContract {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val presenter = CounterPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        presenter.attachContract(this)

        binding.apply {
            btnIncrement.setOnClickListener {
                presenter.onIncrement()
            }
            btnDecrement.setOnClickListener {
                presenter.onDecrement()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachContract()
    }

    override fun showCount(count: String) {
        binding.tvCount.text = count
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor(color: Int) {
        binding.tvCount.setTextColor(color)
    }
}
