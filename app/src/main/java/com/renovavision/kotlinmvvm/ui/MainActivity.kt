package com.renovavision.kotlinmvvm.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.renovavision.kotlinmvvm.R
import com.renovavision.kotlinmvvm.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupToolbar()
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.includeToolbar?.toolbar)
        supportActionBar?.title = getString(R.string.app_name)
    }

}