package com.example.opaynhrms.fragment

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.opaynhrms.R
import com.example.opaynhrms.base.KotlinBaseActivity
import com.example.opaynhrms.databinding.FragementClockifyworkListingBinding
import com.example.opaynhrms.viewmodel.ClockifyListingViewModel
import com.ieltslearning.base.KotlinBaseFragment



class ClockifyWorkListing(var baseActivity: KotlinBaseActivity) : KotlinBaseFragment() {
    lateinit var binding:FragementClockifyworkListingBinding
    lateinit var viewModel:ClockifyListingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragement_clockifywork_listing, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ClockifyListingViewModel::class.java)
        viewModel.setBinder(binding, baseActivity)

    }




}