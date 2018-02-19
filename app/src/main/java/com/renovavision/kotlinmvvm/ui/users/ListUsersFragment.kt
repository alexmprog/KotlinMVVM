package com.renovavision.kotlinmvvm.ui.users;

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.renovavision.kotlinmvvm.R
import com.renovavision.kotlinmvvm.databinding.FragmentListUsersBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

/**
 * Created by Alexandr Golovach on 14.02.2018.
 */

class ListUsersFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: ListUsersViewModel

    private lateinit var binding: FragmentListUsersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ListUsersViewModel::class.java)

        observeLoadingStatus()
        observeResponse()

        viewModel.loadData()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list_users, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(activity)
        binding.swipeContainer.setOnRefreshListener(viewModel::loadData)
        return binding.root
    }

    private fun observeResponse() {
        viewModel.loadingStatus.observe(
                this,
                Observer { isLoading -> binding.swipeContainer.isRefreshing = isLoading ?: false })
    }

    private fun observeLoadingStatus() {
        viewModel.result.observe(
                this,
                Observer { result ->
                    if (result != null) {
                        binding.users = result
                        binding.executePendingBindings()
                    } else {
                        Snackbar.make(binding.root, "Load data errors", Snackbar.LENGTH_LONG).show()
                    }
                }
        )
    }

}
