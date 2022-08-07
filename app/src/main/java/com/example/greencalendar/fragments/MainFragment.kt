package com.example.greencalendar.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.greencalendar.R
import com.example.greencalendar.databinding.FragmentMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        Log.d("MainFragment", "onCreateView")

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main, container, false)

        binding.feedTap.setOnClickListener {

            Log.d("MainFragment", "feedTap")
            it.findNavController().navigate(R.id.action_mainFragment3_to_feedFragment3)
        }


        binding.diaryTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment3_to_diaryFragment2)
        }
        binding.mypageTap.setOnClickListener {

            it.findNavController().navigate(R.id.action_mainFragment3_to_myPageFragment2)
        }

        return binding.root
    }


}