package com.example.month5

class CounterPresenter {
    private val model= CounterModel()
    private var contract: CounterContract? = null



    fun attachContract(counter: CounterContract) {
        this.contract = counter
        contract?.showCount(model.getCount())
    }


    fun onIncrement(){
        model.increment()
        val count = model.getCount()
        contract?.showCount(count.toString())

        if (count == "10"){
            contract?.showToast("Поздравляем!")
        }
        if (count.toInt() == 15){
            contract?.changeTextColor(R.color.green)
        }
        if (count.toInt() == 16){
            contract?.changeTextColor(R.color.black)
        }
        }
    }


    fun onDecrement(){
        model.decrement()
        contract?.showCount(model.getCount())
    }


    fun detachContract() {
        contract = null
    }
}