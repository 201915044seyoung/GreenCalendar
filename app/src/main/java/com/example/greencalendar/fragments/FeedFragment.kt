package com.example.greencalendar.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.greencalendar.R
import com.example.greencalendar.databinding.FragmentFeedBinding


class FeedFragment : Fragment() {

    private lateinit var binding : FragmentFeedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_feed, container, false)
        binding.homeTap.setOnClickListener {

            it.findNavController().navigate(R.id.action_feedFragment3_to_mainFragment3)
        }

        binding.diaryTap.setOnClickListener {

            it.findNavController().navigate(R.id.action_feedFragment3_to_diaryFragment2)
        }
        binding.mypageTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_feedFragment3_to_myPageFragment2)
        }

        return binding.root
    }


}