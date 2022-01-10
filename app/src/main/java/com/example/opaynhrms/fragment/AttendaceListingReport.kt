package com.example.opaynhrms.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.opaynhrms.R
import com.example.opaynhrms.base.KotlinBaseActivity
import com.example.opaynhrms.databinding.FragmentAttendaceListingReportBinding
import com.example.opaynhrms.extensions.visible
import com.example.opaynhrms.viewmodel.AttendanceListingReportViewModel
import com.ieltslearning.base.KotlinBaseFragment
import kotlinx.android.synthetic.main.common_toolbar.view.*
import kotlinx.android.synthetic.main.fragment_attendace_listing_report.*


class AttendaceListingReport(var baseActivity: KotlinBaseActivity) : KotlinBaseFragment() {

    lateinit var binding: FragmentAttendaceListingReportBinding
    lateinit var viewmodel: AttendanceListingReportViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_attendace_listing_report, container, false)
//        binding = DataBindingUtil.setContentView(baseActivity, R.layout.fragment_add_holiday)
        return  binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewmodel = ViewModelProvider(this).get(AttendanceListingReportViewModel::class.java)
        viewmodel.setBinder(binding, baseActivity)



    }




}