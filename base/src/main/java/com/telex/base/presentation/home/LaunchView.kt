package com.telex.base.presentation.home

import com.telex.base.presentation.base.BaseMvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

/**
 * @author Sergey Petrov
 */
@StateStrategyType(AddToEndSingleStrategy::class)
interface LaunchView : BaseMvpView {
    fun showProgress(isVisible: Boolean)
    fun showNext()
    fun onLogout()
}
