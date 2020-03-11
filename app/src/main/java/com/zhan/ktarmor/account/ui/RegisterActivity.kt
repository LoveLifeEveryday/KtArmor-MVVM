package com.zhan.ktarmor.account.ui

import androidx.appcompat.app.AppCompatActivity
import com.zhan.ktarmor.R
import com.zhan.ktarmor.account.vm.RegisterViewModel
import com.zhan.mvvm.annotation.BindViewModel
import com.zhan.mvvm.mvvm.IMvmActivity
import kotlinx.android.synthetic.main.activity_register.*

/**
 *  @author: HyJame
 *  @date:   2019-11-21
 *  @desc:   TODO
 */
class RegisterActivity : AppCompatActivity(), IMvmActivity {

    @BindViewModel
    lateinit var loginViewModel: RegisterViewModel

    override fun getLayoutId(): Int = R.layout.activity_register

    override fun initData() {
        super.initData()

        btnShowToast.setOnClickListener {
            showToast("hello")
        }
    }
}