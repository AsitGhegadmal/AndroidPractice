package com.lumdoom.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.lumdoom.fragmentexample.databinding.FragmentOneBinding

class FragmentOne : Fragment() {

    private lateinit var binding: FragmentOneBinding
    private lateinit var viewModel: CounterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[CounterViewModel::class.java]

        binding.btnCount.setOnClickListener {

            viewModel.count++
            binding.txtCount.text = viewModel.count.toString()

        }
        binding.txtCount.text = viewModel.count.toString()


    }


}