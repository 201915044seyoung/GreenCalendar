package com.example.greencalendar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.greencalendar.R
import com.example.greencalendar.databinding.FragmentMyPageBinding


class MyPageFragment : Fragment() {

    private lateinit var binding: FragmentMyPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_page, container, false)
        binding.homeTap.setOnClickListener {

            it.findNavController().navigate(R.id.action_myPageFragment2_to_mainFragment3)
        }
        binding.diaryTap.setOnClickListener {

            it.findNavController().navigate(R.id.action_myPageFragment2_to_diaryFragment2)
        }
        binding.feedTap.setOnClickListener {

            it.findNavController().navigate(R.id.action_myPageFragment2_to_feedFragment3)
        }


        return binding.root
    }


}